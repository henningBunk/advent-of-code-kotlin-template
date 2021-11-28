package day25

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 25
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay25Part1, ::solveDay25Part2)
}


fun solveDay25Part1(input: List<String>): Int {
    TODO()
}

fun solveDay25Part2(input: List<String>): Int {
    TODO()
}