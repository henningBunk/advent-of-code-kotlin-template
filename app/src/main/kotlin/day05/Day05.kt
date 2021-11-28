package day05

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 5
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay05Part1, ::solveDay05Part2)
}


fun solveDay05Part1(input: List<String>): Int {
    TODO()
}

fun solveDay05Part2(input: List<String>): Int {
    TODO()
}