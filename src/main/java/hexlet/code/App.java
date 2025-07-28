package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static final String[] GAMES = {"Greet", "Even or Odd", "Calculate"};
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int MAX_GAME_SCORE = 3;
    public static String userName;

    public static void main(final String[] args) {
        int gameNumber = Cli.getGameNumber();

        if (gameNumber == 0) {
            return;
        }

        // User greeting by default
        greeting();

        Engine.runSelectedGame(gameNumber);

        SCANNER.close();
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        userName = Cli.getName();
        System.out.println("Hello, " + userName);
    }
}
