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

        String[] gamesList = Engine.getGamesList();

        for (int i = 0; i < gamesList.length; i++) {
            System.out.println((i + 1) + " - " + gamesList[i]);
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = App.SCANNER.nextInt();
        App.SCANNER.nextLine();

        return choice;
    }
    public static String getNextLine() {
        return App.SCANNER.nextLine();
    }
}
