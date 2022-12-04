package day04

fun solveProblem01(input: List<String>): Long {
    return input.stream()
        .map { it.split(",") }
        .map {
            val (left, right) = it
            val (left_l, left_h) = left.split("-").map { it.toInt() }
            val (right_l, right_h) = right.split("-").map { it.toInt() }
            left_l <= right_l && right_h <= left_h || right_l <= left_l && left_h <= right_h
        }
        .filter { it }
        .count()
}

fun solveProblem02(input: List<String>): Long {
    return input.stream()
        .map { it.split(",") }
        .map {
            val (left, right) = it
            val (left_l, left_h) = left.split("-").map { it.toInt() }
            val (right_l, right_h) = right.split("-").map { it.toInt() }
            right_l in left_l..left_h
                    || right_h in left_l..left_h
                    || left_l in right_l..right_h
                    || left_h in right_l..right_h
        }
        .filter { it }
        .count()
}
