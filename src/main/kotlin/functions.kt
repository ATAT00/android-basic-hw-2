package ru.otus

import kotlin.time.Duration
import kotlin.time.measureTime


// 1. Функция с обязательными и необязательными позиционными параметрами
fun mySum(x: Int, y: Int, vararg numbers: Int): Int {
    var sum = x + y
    for (number in numbers) {
        sum += number
    }
    return sum
}

// 2. Функция с необязательным параметром и позиционными параметрами
fun myConcat(vararg strings: String, separator: Char = ' '): String {
    val builder = StringBuilder()
    for (string in strings) {
        builder.append(string)
        builder.append(separator)
    }
    builder.setLength(builder.length - 1)
    return builder.toString()
}

// 4. Функция, измеряющая время выполнения другой функции
fun measureExecutionTime(func: () -> Unit): Duration {
    val duration = measureTime {
        func.invoke()
    }
    return duration
}