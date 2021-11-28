package day02

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 2
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay02Part1, ::solveDay02Part2)
}


fun solveDay02Part1(input: List<String>): Int {
    TODO()
}

fun solveDay02Part2(input: List<String>): Int {
    TODO()
}