package day08

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 8
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay08Part1, ::solveDay08Part2)
}


fun solveDay08Part1(input: List<String>): Int {
    TODO()
}

fun solveDay08Part2(input: List<String>): Int {
    TODO()
}