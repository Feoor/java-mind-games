package hexlet.code;

import java.util.Scanner;

public class App {
    private static final String[] GAMES = {"Greet", "Even or Odd"};
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String name;

    public static void main(final String[] args) {
        int gameNumber = Cli.getGameNumber(SCANNER, GAMES);

        if (gameNumber == -1) {
            return;
        }

        greeting();

        Games games = new Games(SCANNER, name);
        switch (gameNumber) {
            case 1:
                games.evenOrOdd();
                break;
            default:
                break;
        }

        SCANNER.close();
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        name = Cli.getName(SCANNER);
        System.out.println("Hello, " + name);
    }
}
