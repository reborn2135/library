package org.gomafu.library

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthcheckController {

    @GetMapping("/healthcheck")
    fun healthCheck(): String {
        return "OK"
    }
}