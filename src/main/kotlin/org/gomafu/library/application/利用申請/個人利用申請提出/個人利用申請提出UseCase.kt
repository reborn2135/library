package org.gomafu.library.application.利用申請.個人利用申請提出

import org.gomafu.library.application.UlidPort
import org.gomafu.library.domain.利用申請.個人利用申請提出
import org.gomafu.library.domain.利用申請.利用申請Port
import org.springframework.stereotype.Service
import java.sql.SQLOutput

@Service
class 個人利用申請提出UseCase(
    val ulidPort: UlidPort,
    val 利用申請Port: 利用申請Port
) {

    fun handle(param: 個人利用申請提出Param): 個人利用申請提出 {
        // TODO: バリデーション
        val 個人利用申請提出 = 個人利用申請提出(
            個人利用申請提出ID = ulidPort.new(),
            氏名 = param.氏名,
            生年月日 = param.生年月日,
            電話番号 = param.電話番号,
            メールアドレス = param.メールアドレス,
            住所 = param.住所,
            利用目的 = param.利用目的,
            証明書保存先 = "",
        )
        println(param.証明書保存先)
        利用申請Port.save(個人利用申請提出)
        return 個人利用申請提出
    }

}