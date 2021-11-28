package day13

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 13
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay13Part1, ::solveDay13Part2)
}


fun solveDay13Part1(input: List<String>): Int {
    TODO()
}

fun solveDay13Part2(input: List<String>): Int {
    TODO()
}