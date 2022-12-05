package day05

import org.junit.jupiter.api.Test
import util.InputReader
import kotlin.test.Ignore
import kotlin.test.assertEquals
import day05.solveProblem01 as solveProblem01
import day05.solveProblem02 as solveProblem02

internal class ProblemTest {

    @Test
    internal fun testExample01() {
        assertEquals("CMZ", solveProblem01(InputReader.asListOfStrings("day05/input01-example.txt")))
    }

    @Test
    internal fun testProblem01() {
        assertEquals("TDCHVHJTG", solveProblem01(InputReader.asListOfStrings("day05/input01.txt")))
    }

    @Test
    internal fun testExample02() {
        assertEquals("MCD", solveProblem02(InputReader.asListOfStrings("day05/input01-example.txt")))
    }

    @Test
    internal fun testProblem02() {
        assertEquals("NGCMPJLHV", solveProblem02(InputReader.asListOfStrings("day05/input01.txt")))
    }
}
