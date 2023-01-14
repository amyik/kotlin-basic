package com.amyik.inheritance

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class InheritanceTest{

    @Test
    internal fun inheritanceTest() {
        val child1 = Child1("Jane")
        val child2 = Child2("John")

        assertThat(child1.lastName).isEqualTo("Jane")
        assertThat(child2.lastName).isEqualTo("John")
    }
}
