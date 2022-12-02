package day02

fun solveProblem01(input: List<Pair<String, String>>): Int {
    var score = 0
    input.forEach {
        score += round01(it)
    }
    return score
}

// A for Rock, B for Paper, and C for Scissors
// X for Rock, Y for Paper, and Z for Scissors
// score: (1 for Rock, 2 for Paper, and 3 for Scissors) + (0 if you lost, 3 if the round was a draw, and 6 if you won)
private fun round01(pair: Pair<String, String>): Int {
    var figureScore = 0
    when (pair.second) {
        "X" -> figureScore = 1
        "Y" -> figureScore = 2
        "Z" -> figureScore = 3

    }

    var winningScore = 0
    when (pair) {
        Pair("A", "X") -> winningScore = 3
        Pair("A", "Y") -> winningScore = 6
        Pair("A", "Z") -> winningScore = 0

        Pair("B", "X") -> winningScore = 0
        Pair("B", "Y") -> winningScore = 3
        Pair("B", "Z") -> winningScore = 6

        Pair("C", "X") -> winningScore = 6
        Pair("C", "Y") -> winningScore = 0
        Pair("C", "Z") -> winningScore = 3
    }

    return figureScore + winningScore
}

fun solveProblem02(input: List<Pair<String, String>>): Int {
    var score = 0
    input.forEach {
        score += round02(it)
    }
    return score
}

// A for Rock, B for Paper, and C for Scissors
// X for lose, Y for draw, and Z for win
// score: (1 for Rock, 2 for Paper, and 3 for Scissors) + (0 if you lost, 3 if the round was a draw, and 6 if you won)
private fun round02(pair: Pair<String, String>): Int {
    var winningScore = 0
    when (pair.second) {
        "X" -> winningScore = 0
        "Y" -> winningScore = 3
        "Z" -> winningScore = 6

    }

    var figureScore = 0
    when (pair) {
        // rock
        Pair("A", "X") -> figureScore = 3 // lose with scissors
        Pair("A", "Y") -> figureScore = 1 // draw with rock
        Pair("A", "Z") -> figureScore = 2 // win with paper

        // paper
        Pair("B", "X") -> figureScore = 1 // lose with rock
        Pair("B", "Y") -> figureScore = 2 // draw with paper
        Pair("B", "Z") -> figureScore = 3 // win with scissors

        // scissors
        Pair("C", "X") -> figureScore = 2 // lose with paper
        Pair("C", "Y") -> figureScore = 3 // draw with scissors
        Pair("C", "Z") -> figureScore = 1 // win with rock
    }

    return figureScore + winningScore
}
