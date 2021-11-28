package day04

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 4
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay04Part1, ::solveDay04Part2)
}


fun solveDay04Part1(input: List<String>): Int {
    TODO()
}

fun solveDay04Part2(input: List<String>): Int {
    TODO()
}