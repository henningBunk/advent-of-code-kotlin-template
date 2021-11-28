package day01

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class Day01Test : FreeSpec({

    val sampleInput: List<String> = listOf(
    )

    val sampleSolutionPart1: Int = -1

    val sampleSolutionPart2: Int = -1

    "Solving day 1" - {
        "part 1 for the sample input should return the correct output" {
            solveDay01Part1(sampleInput) shouldBe sampleSolutionPart1
        }

        "part 2 for the sample input should return the correct output" {
            solveDay01Part2(sampleInput) shouldBe sampleSolutionPart2
        }
    }
})
