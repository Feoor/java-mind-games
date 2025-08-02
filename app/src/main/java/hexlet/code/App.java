package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final String[] games = {"Greet", "Even or Odd", "Calculate", "GCD", "Progression", "Prime"};
    public static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;

    public static void main(final String[] args) {
        String selectedGame = Cli.getSelectedGame(games);

        Game game;
        switch (selectedGame) {
            case "1":
                greeting();
                return;
            case "2":
                game = new EvenOrOdd();
                break;
            case "3":
                game = new CalculateGame();
                break;
            case "4":
                game = new GCD();
                break;
            case "5":
                game = new Progression();
                break;
            case "6":
                game = new Prime();
                break;
            default:
                System.out.println("Invalid game selection.");
                return;
        }

        // User greeting by default
        greeting();

        Engine engine = new Engine(game, userName);
        engine.runGame();

        SCANNER.close();
    }

    public static String getUserName() {
        return userName;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        userName = Cli.getName();
        System.out.println("Hello, " + userName);
    }
}
