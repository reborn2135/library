package org.gomafu.library.domain.利用申請

import java.time.LocalDate

data class 個人利用申請提出(
    val 個人利用申請提出ID: String,
    val 氏名: String,
    val 生年月日: LocalDate,
    val 電話番号: String,
    val メールアドレス: String,
    val 住所: String,
    val 利用目的: String,
    val 証明書保存先: String
)