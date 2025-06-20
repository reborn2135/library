#!/usr/bin/env python3
"""
kotlin-result拡張関数生成スクリプト
zip, zipOrAccumulate関数を引数6個から20個まで生成します
"""

def generate_type_params(count):
    """型パラメータを生成 (T1, T2, ..., TN, E, V)"""
    types = [f"T{i}" for i in range(1, count + 1)]
    return ", ".join(types + ["E", "V"])

def generate_producer_params(count):
    """プロデューサーパラメータを生成"""
    params = [f"producer{i}: Producer<T{i}, E>" for i in range(1, count + 1)]
    return ",\n    ".join(params)

def generate_transform_param(count):
    """transform関数パラメータを生成"""
    types = [f"T{i}" for i in range(1, count + 1)]
    return f"transform: ({', '.join(types)}) -> V"

def generate_contract_calls(count):
    """contract内のcallsInPlace呼び出しを生成"""
    calls = [f"callsInPlace(producer{i}, InvocationKind.EXACTLY_ONCE)" for i in range(1, count + 1)]
    calls.append("callsInPlace(transform, InvocationKind.AT_MOST_ONCE)")
    return "\n        ".join(calls)

def generate_zip_contract_calls(count):
    """zip用のcontract内のcallsInPlace呼び出しを生成"""
    calls = ["callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)"]
    calls.extend([f"callsInPlace(producer{i}, InvocationKind.AT_MOST_ONCE)" for i in range(2, count + 1)])
    calls.append("callsInPlace(transform, InvocationKind.AT_MOST_ONCE)")
    return "\n        ".join(calls)

def generate_result_assignments(count):
    """result変数の代入を生成"""
    assignments = [f"val result{i} = producer{i}()" for i in range(1, count + 1)]
    return "\n    ".join(assignments)

def generate_results_list(count):
    """resultsリストを生成"""
    results = [f"result{i}" for i in range(1, count + 1)]
    return ",\n        ".join(results)

def generate_transform_call_values(count):
    """transform関数呼び出しの値を生成"""
    values = [f"result{i}.value" for i in range(1, count + 1)]
    return ",\n            ".join(values)

def generate_zip_or_accumulate(count):
    """zipOrAccumulate関数を生成"""
    return f"""@OptIn(ExperimentalContracts::class)
public inline fun <{generate_type_params(count)}> zipOrAccumulate(
    {generate_producer_params(count)},
    {generate_transform_param(count)},
): Result<V, List<E>> {{
    contract {{
        {generate_contract_calls(count)}
    }}

    {generate_result_assignments(count)}

    val results = listOf(
        {generate_results_list(count)}
    )

    return if (results.allOk()) {{
        val transformed = transform(
            {generate_transform_call_values(count)},
        )

        Ok(transformed)
    }} else {{
        Err(results.filterErrors())
    }}
}}"""


def generate_zip_flatmap_chain(count):
    """zip用のflatMapチェーンを生成"""
    if count == 1:
        return "producer1().map { v1 -> transform(v1) }"
    
    chain = "producer1().flatMap { v1 ->"
    indent = "        "
    
    for i in range(2, count):
        chain += f"\n{indent}producer{i}().flatMap {{ v{i} ->"
        indent += "    "
    
    # 最後のproducerはmapを使用
    chain += f"\n{indent}producer{count}().map {{ v{count} ->"
    indent += "    "
    
    # transform呼び出し
    values = [f"v{i}" for i in range(1, count + 1)]
    chain += f"\n{indent}transform({', '.join(values)})"
    
    # 閉じ括弧
    for i in range(count):
        indent = indent[:-4]
        chain += f"\n{indent}}}"
    
    return chain

def generate_zip(count):
    """zip関数を生成"""
    return f"""@OptIn(ExperimentalContracts::class)
public inline fun <{generate_type_params(count)}> zip(
    {generate_producer_params(count)},
    {generate_transform_param(count)},
): Result<V, E> {{
    contract {{
        {generate_zip_contract_calls(count)}
    }}

    return {generate_zip_flatmap_chain(count)}
}}"""

def main():
    print("package org.gomafu.library.extension")
    print()
    print("import com.github.michaelbull.result.*")
    print("import kotlin.contracts.InvocationKind")
    print("import kotlin.contracts.contract")
    print("import kotlin.contracts.ExperimentalContracts")
    print()
    print("private typealias Producer<T, E> = () -> Result<T, E>")
    print()
    print("// kotlin-result拡張関数 (引数6-20個)")
    print("// 自動生成されたコード - 手動編集しないでください")
    print()
    
    for count in range(6, 21):
        print(f"// ===== 引数{count}個 =====")
        print()
        print(generate_zip_or_accumulate(count))
        print()
        print(generate_zip(count))
        print()

if __name__ == "__main__":
    main()