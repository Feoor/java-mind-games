package hexlet.code;
import java.util.Scanner;

public final class Cli {
    private Cli() {
        throw new IllegalStateException("Utility class");
    }

    public static String getName(Scanner sc) {
        System.out.print("May I have your name? ");
        return sc.nextLine();
    }

    public static int getGameNumber(Scanner sc, String[] games) {
        System.out.println("Please enter the game number and press Enter.");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + " - " + games[i]);
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = sc.nextInt() - 1;
        sc.nextLine();

        return choice;
    }
}
