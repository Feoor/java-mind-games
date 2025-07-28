package hexlet.code;

public final class Cli {
    private Cli() {
        throw new IllegalStateException("Utility class");
    }

    public static String getName() {
        System.out.print("May I have your name? ");
        return App.SCANNER.nextLine();
    }
    public static int getGameNumber() {
        System.out.println("Please enter the game number and press Enter.");

        for (int i = 0; i < App.GAMES.length; i++) {
            System.out.println((i + 1) + " - " + App.GAMES[i]);
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = App.SCANNER.nextInt();
        App.SCANNER.nextLine();

        return choice;
    }
    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        return App.SCANNER.nextLine();
    }
}
