package common

import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

typealias Input = List<String>
typealias Solution = Int
typealias SolvingFun = (Input) -> Solution

fun solve(
    day: Int,
    input: Input,
    solvePart1: SolvingFun,
    solvePart2: SolvingFun,
) {
    solvePart(day, 1, input, solvePart1)
    solvePart(day, 2, input, solvePart2)
}

@OptIn(ExperimentalTime::class)
private fun solvePart(day: Int, part: Int, input: Input, solve: SolvingFun) {
    try {
        println("\nStart solving part $part.")
        val solution = measureTimedValue { solve(input) }
        println("\nSolving part $part took ${solution.duration}.")
        println("The solution for day $day part $part is: ${solution.value}")
    } catch (ignored: NotImplementedError) {
        println("Skipped part $part.")
    }
}