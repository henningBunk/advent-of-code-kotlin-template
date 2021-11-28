package day07

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 7
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay07Part1, ::solveDay07Part2)
}


fun solveDay07Part1(input: List<String>): Int {
    TODO()
}

fun solveDay07Part2(input: List<String>): Int {
    TODO()
}