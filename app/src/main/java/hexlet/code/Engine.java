package hexlet.code;

import hexlet.code.games.Game;

import java.util.NoSuchElementException;
import java.util.Random;

public class Engine {
    private static final Random RANDOM = new Random();
    private final Game game;
    private final String username;
    private int score = 0;

    Engine(final Game game, final String username) {
        this.username = username;
        this.game = game;
    }

    public void runGame() {
        System.out.println(game.getDescription());

        int maxGameScore = 3;
        while (score < maxGameScore) {
            System.out.println("Question: " + game.getNextQuestion());

            System.out.print("Your answer: ");

            String userAnswer;
            try {
                userAnswer = Cli.getNextLine();
            } catch (NoSuchElementException e) {
                return;
            }

            boolean isCorrect = game.checkAnswer(userAnswer);
            if (isCorrect) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + game.getAnswer() + "'.");
                System.out.println("Let's try again, " + username + "!");
                score = 0;
            }
        }

        System.out.println("Congratulations, " + username + "!");
    }

    public static int getRandomNumber(final int min, final int max) {
        return RANDOM.nextInt(min, max);
    }
    public static int getRandomNumber(final int bound) {
        return RANDOM.nextInt(bound);
    }

    // Getter's
    public int getScore() {
        return score;
    }
}
