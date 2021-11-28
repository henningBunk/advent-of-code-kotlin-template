package day24

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 24
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay24Part1, ::solveDay24Part2)
}


fun solveDay24Part1(input: List<String>): Int {
    TODO()
}

fun solveDay24Part2(input: List<String>): Int {
    TODO()
}