package day10

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 10
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay10Part1, ::solveDay10Part2)
}


fun solveDay10Part1(input: List<String>): Int {
    TODO()
}

fun solveDay10Part2(input: List<String>): Int {
    TODO()
}