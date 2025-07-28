package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public final class CalculateGame implements Game {
    private CalculateGame() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        System.out.println("What is the result of expression?");

        final char[] expressions = {'+', '-', '*'};
        final int maxBound = 25;
        int score = 0;
        while (score < App.MAX_GAME_SCORE) {
            int firstNumber = App.RANDOM.nextInt(maxBound);
            int secondNumber = App.RANDOM.nextInt(maxBound);
            char randomExpression = expressions[App.RANDOM.nextInt(expressions.length)];

            int questionAnswer = switch (randomExpression) {
                case '+' -> firstNumber + secondNumber;
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                default ->
                    // By default, is addition
                    firstNumber + secondNumber;
            };

            System.out.println("Question: " + firstNumber + " " + randomExpression  + " " + secondNumber);
            int userAnswer = Integer.parseInt(Cli.getUserAnswer());
            if (questionAnswer == userAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + userAnswer + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                score = 0;
            }
        }
    }
}
