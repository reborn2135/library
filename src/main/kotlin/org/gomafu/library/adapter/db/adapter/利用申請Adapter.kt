package org.gomafu.library.adapter.db.adapter

import org.gomafu.library.domain.利用申請.個人利用申請提出
import org.gomafu.library.domain.利用申請.利用申請Port
import org.springframework.stereotype.Component

@Component
class 利用申請Adapter: 利用申請Port {
    override fun save(個人利用申請提出: 個人利用申請提出) {
        println("個人利用申請提出 saved")
    }
}