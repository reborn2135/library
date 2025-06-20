package org.gomafu.library.adapter

import de.huxhorn.sulky.ulid.ULID
import org.gomafu.library.application.UlidPort
import org.springframework.stereotype.Component

@Component
class UlidAdapter : UlidPort {
    override fun new(): String {
        return ulidGenerator.nextULID()
    }

    companion object {
        val ulidGenerator = ULID()
    }
}