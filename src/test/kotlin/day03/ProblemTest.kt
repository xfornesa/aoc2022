package day03

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.Ignore
import kotlin.test.assertEquals
import day03.solveProblem01 as solveProblem01
import day03.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals(157, solveProblem01(InputReader.asListOfStrings("day03/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        assertEquals(8088, solveProblem01(InputReader.asListOfStrings("day03/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals(70, solveProblem02(InputReader.asListOfStrings("day03/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals(2522, solveProblem02(InputReader.asListOfStrings("day03/input01.txt")))
    }
}
