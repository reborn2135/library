package org.gomafu.library.extension

import com.github.michaelbull.result.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import kotlin.contracts.ExperimentalContracts

private typealias Producer<T, E> = () -> Result<T, E>

// kotlin-result拡張関数 (引数6-20個)
// 自動生成されたコード - 手動編集しないでください

// ===== 引数6個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    transform: (T1, T2, T3, T4, T5, T6) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    transform: (T1, T2, T3, T4, T5, T6) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().map { v6 ->
                            transform(v1, v2, v3, v4, v5, v6)
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数7個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().map { v7 ->
                                transform(v1, v2, v3, v4, v5, v6, v7)
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数8個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().map { v8 ->
                                    transform(v1, v2, v3, v4, v5, v6, v7, v8)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数9個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().map { v9 ->
                                        transform(v1, v2, v3, v4, v5, v6, v7, v8, v9)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数10個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().map { v10 ->
                                            transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数11個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().map { v11 ->
                                                transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数12個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().map { v12 ->
                                                    transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数13個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().map { v13 ->
                                                        transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数14個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().map { v14 ->
                                                            transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数15個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().map { v15 ->
                                                                transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数16個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer16, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()
    val result16 = producer16()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15,
        result16
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
            result16.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer16, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().flatMap { v15 ->
                                                                producer16().map { v16 ->
                                                                    transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数17個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer16, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer17, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()
    val result16 = producer16()
    val result17 = producer17()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15,
        result16,
        result17
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
            result16.value,
            result17.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer16, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer17, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().flatMap { v15 ->
                                                                producer16().flatMap { v16 ->
                                                                    producer17().map { v17 ->
                                                                        transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17)
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数18個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer16, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer17, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer18, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()
    val result16 = producer16()
    val result17 = producer17()
    val result18 = producer18()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15,
        result16,
        result17,
        result18
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
            result16.value,
            result17.value,
            result18.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer16, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer17, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer18, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().flatMap { v15 ->
                                                                producer16().flatMap { v16 ->
                                                                    producer17().flatMap { v17 ->
                                                                        producer18().map { v18 ->
                                                                            transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18)
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数19個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    producer19: Producer<T19, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer16, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer17, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer18, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer19, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()
    val result16 = producer16()
    val result17 = producer17()
    val result18 = producer18()
    val result19 = producer19()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15,
        result16,
        result17,
        result18,
        result19
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
            result16.value,
            result17.value,
            result18.value,
            result19.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    producer19: Producer<T19, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer16, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer17, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer18, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer19, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().flatMap { v15 ->
                                                                producer16().flatMap { v16 ->
                                                                    producer17().flatMap { v17 ->
                                                                        producer18().flatMap { v18 ->
                                                                            producer19().map { v19 ->
                                                                                transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19)
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// ===== 引数20個 =====

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E, V> zipOrAccumulate(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    producer19: Producer<T19, E>,
    producer20: Producer<T20, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> V,
): Result<V, List<E>> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer3, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer4, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer5, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer6, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer7, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer8, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer9, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer10, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer11, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer12, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer13, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer14, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer15, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer16, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer17, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer18, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer19, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer20, InvocationKind.EXACTLY_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    val result1 = producer1()
    val result2 = producer2()
    val result3 = producer3()
    val result4 = producer4()
    val result5 = producer5()
    val result6 = producer6()
    val result7 = producer7()
    val result8 = producer8()
    val result9 = producer9()
    val result10 = producer10()
    val result11 = producer11()
    val result12 = producer12()
    val result13 = producer13()
    val result14 = producer14()
    val result15 = producer15()
    val result16 = producer16()
    val result17 = producer17()
    val result18 = producer18()
    val result19 = producer19()
    val result20 = producer20()

    val results = listOf(
        result1,
        result2,
        result3,
        result4,
        result5,
        result6,
        result7,
        result8,
        result9,
        result10,
        result11,
        result12,
        result13,
        result14,
        result15,
        result16,
        result17,
        result18,
        result19,
        result20
    )

    return if (results.allOk()) {
        val transformed = transform(
            result1.value,
            result2.value,
            result3.value,
            result4.value,
            result5.value,
            result6.value,
            result7.value,
            result8.value,
            result9.value,
            result10.value,
            result11.value,
            result12.value,
            result13.value,
            result14.value,
            result15.value,
            result16.value,
            result17.value,
            result18.value,
            result19.value,
            result20.value,
        )

        Ok(transformed)
    } else {
        Err(results.filterErrors())
    }
}

@OptIn(ExperimentalContracts::class)
public inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E, V> zip(
    producer1: Producer<T1, E>,
    producer2: Producer<T2, E>,
    producer3: Producer<T3, E>,
    producer4: Producer<T4, E>,
    producer5: Producer<T5, E>,
    producer6: Producer<T6, E>,
    producer7: Producer<T7, E>,
    producer8: Producer<T8, E>,
    producer9: Producer<T9, E>,
    producer10: Producer<T10, E>,
    producer11: Producer<T11, E>,
    producer12: Producer<T12, E>,
    producer13: Producer<T13, E>,
    producer14: Producer<T14, E>,
    producer15: Producer<T15, E>,
    producer16: Producer<T16, E>,
    producer17: Producer<T17, E>,
    producer18: Producer<T18, E>,
    producer19: Producer<T19, E>,
    producer20: Producer<T20, E>,
    transform: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> V,
): Result<V, E> {
    contract {
        callsInPlace(producer1, InvocationKind.EXACTLY_ONCE)
        callsInPlace(producer2, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer3, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer4, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer5, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer6, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer7, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer8, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer9, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer10, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer11, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer12, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer13, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer14, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer15, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer16, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer17, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer18, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer19, InvocationKind.AT_MOST_ONCE)
        callsInPlace(producer20, InvocationKind.AT_MOST_ONCE)
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return producer1().flatMap { v1 ->
        producer2().flatMap { v2 ->
            producer3().flatMap { v3 ->
                producer4().flatMap { v4 ->
                    producer5().flatMap { v5 ->
                        producer6().flatMap { v6 ->
                            producer7().flatMap { v7 ->
                                producer8().flatMap { v8 ->
                                    producer9().flatMap { v9 ->
                                        producer10().flatMap { v10 ->
                                            producer11().flatMap { v11 ->
                                                producer12().flatMap { v12 ->
                                                    producer13().flatMap { v13 ->
                                                        producer14().flatMap { v14 ->
                                                            producer15().flatMap { v15 ->
                                                                producer16().flatMap { v16 ->
                                                                    producer17().flatMap { v17 ->
                                                                        producer18().flatMap { v18 ->
                                                                            producer19().flatMap { v19 ->
                                                                                producer20().map { v20 ->
                                                                                    transform(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20)
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

