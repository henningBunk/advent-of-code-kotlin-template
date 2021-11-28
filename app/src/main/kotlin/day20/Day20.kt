package day20

import common.InputRepo
import common.readSessionCookie
import common.solve

fun main(args: Array<String>) {
    val day = 20
    val input = InputRepo(args.readSessionCookie()).get(day = day)

    solve(day, input, ::solveDay20Part1, ::solveDay20Part2)
}


fun solveDay20Part1(input: List<String>): Int {
    TODO()
}

fun solveDay20Part2(input: List<String>): Int {
    TODO()
}