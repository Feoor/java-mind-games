package hexlet.code;

import hexlet.code.games.Game;

import java.util.NoSuchElementException;
import java.util.Random;

public final class Engine {
    private static final int MAX_GAME_SCORE = 3;
    private static final Random RANDOM = new Random();
    private final Game game;
    private final String username;
    private int score = 0;

    Engine(final Game inputGame, final String inputUsername) {
        this.username = inputUsername;
        this.game = inputGame;
    }

    public void runGame() {
        System.out.println(game.getDescription());

        while (score < MAX_GAME_SCORE) {
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
                return;
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
