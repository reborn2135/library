package org.gomafu.library.adapter.api

import org.gomafu.library.application.利用申請.個人利用申請提出.個人利用申請提出Param
import org.gomafu.library.application.利用申請.個人利用申請提出.個人利用申請提出UseCase
import org.gomafu.library.domain.利用申請.個人利用申請提出
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class 利用申請Controller(
    val 個人利用申請提出UseCase: 個人利用申請提出UseCase
) {

    @PostMapping("個人利用申請提出", consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun 個人利用申請提出(@ModelAttribute @Validated param: 個人利用申請提出Param): 個人利用申請提出 {
        return 個人利用申請提出UseCase.handle(param)
    }
}