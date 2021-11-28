package day12

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 12
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay12Part1, ::solveDay12Part2)
}


fun solveDay12Part1(input: List<String>): Int {
    TODO()
}

fun solveDay12Part2(input: List<String>): Int {
    TODO()
}