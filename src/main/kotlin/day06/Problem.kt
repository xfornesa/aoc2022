package day06

fun solveProblem01(input: List<String>): Int {
    return findDistincCharPosition(input.first(), 4)
}

private fun findDistincCharPosition(row: String, size: Int): Int {
    var result = 0
    row
        .asSequence()
        .windowed(size, 1)
        .forEachIndexed { index, word ->
            if (word.asSequence().toSet().count() == size && result == 0) {
                result = index + size
            }
        }

    return result
}

fun solveProblem02(input: List<String>): Int {
    return findDistincCharPosition(input.first(), 14)
}
