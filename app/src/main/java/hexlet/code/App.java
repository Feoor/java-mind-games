package hexlet.code;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;

    public static void main(final String[] args) {
        int gameNumber = Cli.getGameNumber();

        if (gameNumber == 0) {
            return;
        } else if (gameNumber == 1) {
            greeting();
        }

        // User greeting by default
        greeting();

        Engine engine = new Engine(gameNumber, userName);
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
