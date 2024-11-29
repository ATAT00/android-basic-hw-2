package ru.otus

import kotlin.system.measureTimeMillis


fun measureExecutionTime2(block: () -> Unit): Long {
    return measureTimeMillis {
        block()
    }
}

fun longRunningTask() {
    for (i in 1..10_000) {
        println("Processing item $i")
    }
}

fun main() {
    val executionTime = measureExecutionTime2 {
        longRunningTask()
    }

    println("Execution time: $executionTime ms")
}