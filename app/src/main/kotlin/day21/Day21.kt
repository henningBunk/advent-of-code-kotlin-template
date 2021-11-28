package day21

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 21
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay21Part1, ::solveDay21Part2)
}


fun solveDay21Part1(input: List<String>): Int {
    TODO()
}

fun solveDay21Part2(input: List<String>): Int {
    TODO()
}