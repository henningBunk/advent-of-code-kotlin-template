package day22

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 22
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay22Part1, ::solveDay22Part2)
}


fun solveDay22Part1(input: List<String>): Int {
    TODO()
}

fun solveDay22Part2(input: List<String>): Int {
    TODO()
}