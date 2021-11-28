package day09

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 9
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay09Part1, ::solveDay09Part2)
}


fun solveDay09Part1(input: List<String>): Int {
    TODO()
}

fun solveDay09Part2(input: List<String>): Int {
    TODO()
}