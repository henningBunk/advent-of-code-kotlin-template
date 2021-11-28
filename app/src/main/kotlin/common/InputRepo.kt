package common

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.Headers
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import java.io.File
import kotlin.system.exitProcess

class InputRepo(
    private val sessionCookie: String,
    private val year: Int = 2021,
) {
    fun get(day: Int): List<String> {
        val file = File("input/$year-$day.txt")
        return when {
            file.exists() -> {
                println("Loading input for day $day from cache.")
                file.read()
            }
            else -> {
                println("Downloading input for day $day.")
                download(day)
                    .also {
                        file.write(it)
                        println("Input saved to cache.")
                    }
                    .lines()
            }
        }
    }

    private fun File.read(): List<String> = useLines { it.toList() }

    private fun File.write(data: String) {
        parentFile.mkdirs()
        writeText(data)
    }

    private fun download(day: Int): String {
        val (_, response, result) = getUrl(day)
            .httpGet()
            .appendHeader(Headers.COOKIE to "session=$sessionCookie")
            .responseString()

        when (result) {
            is Result.Success -> return result.get().trim()
            is Result.Failure -> {
                printError(response, result)
                exitProcess(1)
            }
        }
    }

    private fun printError(response: Response, result: Result.Failure<FuelError>) {
        println("\nError downloading the input. ${response.statusCode}: ${response.responseMessage}")
        when (response.statusCode) {
            404 -> println("Did you wake up too early?")
            400 -> println("Is your session cookie correctly set up?")
        }
    }

    private fun getUrl(day: Int): String = "https://adventofcode.com/$year/day/$day/input"
}