package org.gomafu.library.application.利用申請

import org.gomafu.library.application.利用申請.個人利用申請提出.個人利用申請提出Param
import org.gomafu.library.application.利用申請.個人利用申請提出.個人利用申請提出UseCase
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.String

@SpringBootTest
class 利用申請Test(
    val 個人利用申請提出UseCase: 個人利用申請提出UseCase
) {

    @Test
    fun 個人利用申請提出Test() {
        // given
        val param = 個人利用申請提出Param(
            氏名 = "",
            生年月日 = LocalDate.of(1990, 1, 1),
            電話番号 = "",
            メールアドレス = "",
            住所 = "",
            利用目的 = "",
            証明書保存先 = "",
        )

        // when
        個人利用申請提出UseCase.handle(param)

        // then
        個人利用申請提出UseCase.handle(param)

    }

}