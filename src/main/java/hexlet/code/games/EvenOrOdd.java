package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public final class EvenOrOdd implements Game {
    private EvenOrOdd() {
        throw new IllegalStateException("Utility class");
    }

    public static void run() {
        System.out.println("Answer 'yes' if the number is even, otherwise 'no'");

        final int maxBound = 50;
        int score = 0;
        while (score < App.MAX_GAME_SCORE) {
            int randomNumber = App.RANDOM.nextInt(maxBound);
            System.out.println("Question: " + randomNumber);
            boolean isEven = randomNumber % 2 == 0;

            String userAnswer = Cli.getUserAnswer();

            if (isEven) {
                if (userAnswer.equals("yes")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + userAnswer + "' is not a valid answer ;(. Correct answer was `yes`.");
                    System.out.println("Let's try again, " + App.userName + "!");
                    score = 0;
                }
            } else {
                if (userAnswer.equals("no")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + userAnswer + "' is not a valid answer ;(. Correct answer was `no`");
                    System.out.println("Let's try again, " + App.userName + "!");
                    score = 0;
                }
            }
        }

        System.out.println("Congratulations, " + App.userName + "!");
    }
}
