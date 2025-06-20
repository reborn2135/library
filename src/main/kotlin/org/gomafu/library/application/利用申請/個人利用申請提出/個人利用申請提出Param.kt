package org.gomafu.library.application.利用申請.個人利用申請提出

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size
import org.springframework.web.multipart.MultipartFile
import java.time.LocalDate

data class 個人利用申請提出Param(
    @field:Size(max = 10)
    @field:JsonProperty("氏名") val 氏名: String,
    @field:JsonProperty("生年月日") val 生年月日: LocalDate,
    @field:JsonProperty("電話番号") val 電話番号: String,
    @field:JsonProperty("メールアドレス") val メールアドレス: String,
    @field:JsonProperty("住所") val 住所: String,
    @field:JsonProperty("利用目的") val 利用目的: String,
    @field:JsonProperty("証明書保存先") @Schema(format = "binary") val 証明書保存先: MultipartFile
)