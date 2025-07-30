package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.EvenOrOdd;
import hexlet.code.games.CalculateGame;

import java.util.Random;

public class Engine {
    private static final String[] GAMES = {"Greet", "Even or Odd", "Calculate", "GCD"};
    private static final Random RANDOM = new Random();
    private final Game game;
    private final int maxGameScore;
    private final String username;
    private int score = 0;

    Engine(final int maxGameScore, final int selectedGame, final String username) {
        this.maxGameScore = maxGameScore;
        this.username = username;
        this.game = switch (selectedGame) {
            case 2 -> new EvenOrOdd();
            case 3 -> new CalculateGame();
            case 4 -> new GCD();
            default -> throw new IllegalArgumentException("Invalid game selected");
        };
    }
    Engine(final int selectedGame, final String username) {
        this.maxGameScore = 3;
        this.username = username;
        this.game = switch (selectedGame) {
            case 2 -> new EvenOrOdd();
            case 3 -> new CalculateGame();
            case 4 -> new GCD();
            default -> throw new IllegalArgumentException("Invalid game selected");
        };
    }

    public void runGame() {
        System.out.println(game.getDescription());

        while (score < maxGameScore) {
            System.out.println("Question: " + game.getNextQuestion());

            System.out.print("Your answer: ");
            String userAnswer = Cli.getNextLine();
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
    public static String[] getGamesList() {
        return GAMES;
    }
    public int getScore() {
        return score;
    }
}
