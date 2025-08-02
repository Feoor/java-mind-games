package hexlet.code;

public final class Cli {
    private Cli() {
        throw new IllegalStateException("Utility class");
    }

    public static String getName() {
        System.out.println("May I have your name? ");
        return App.SCANNER.nextLine();
    }
    public static String getSelectedGame(String[] gamesList) {
        System.out.println("Please enter the game number and press Enter.");

        for (int i = 0; i < gamesList.length; i++) {
            System.out.println((i + 1) + " - " + gamesList[i]);
        }
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");

        return App.SCANNER.nextLine();
    }
    public static String getNextLine() {
        return App.SCANNER.nextLine();
    }
}
