package day09

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class Day09Test : FreeSpec({

    val sampleInput: List<String> = listOf(
    )

    val sampleSolutionPart1: Int = -1

    val sampleSolutionPart2: Int = -1

    "Solving day 9" - {
        "part 1 for the sample input should return the correct output" {
            solveDay09Part1(sampleInput) shouldBe sampleSolutionPart1
        }

        "part 2 for the sample input should return the correct output" {
            solveDay09Part2(sampleInput) shouldBe sampleSolutionPart2
        }
    }
})