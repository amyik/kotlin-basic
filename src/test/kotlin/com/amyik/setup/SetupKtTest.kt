package com.amyik.setup

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SetupKtTest {

    @Test
    fun myFunctionTest() {
        assertEquals("works", myFunction())
        assertThat(myFunction()).isEqualTo("works")
    }
}