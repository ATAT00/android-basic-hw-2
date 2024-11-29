package ru.otus

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.time.Duration.Companion.seconds

class FunctionsTest {
    @Test
    fun mySumTestTwoNumbers() {
        val sum = mySum(1, 2)
        assertEquals(sum, 3)
    }

    @Test
    fun mySumTestMoreNumbers() {
        val sum = mySum(1, 2, 3, 4)
        assertEquals(sum, 10)
    }

    // 3. Тестовая функция для пункта №2
    @Test
    fun myConcatDefaultSeparator() {
        val sum = myConcat("str1", "str2", "str3")
        assertEquals(sum, "str1 str2 str3")
    }

    @Test
    fun myConcatSpecificSeparator() {
        val sum = myConcat("str1", "str2", "str3", separator = ',')
        assertEquals(sum, "str1,str2,str3")
    }

    @Test
    fun measureExecutionTimeTest() {
        val seconds = 1L
        val duration = measureExecutionTime { testFunction(seconds) }
        assertEquals(duration.inWholeSeconds, seconds)

    }

    fun testFunction(seconds: Long) {
        Thread.sleep(seconds.seconds.inWholeMilliseconds)
    }
}