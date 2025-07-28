package hexlet.code;

import hexlet.code.games.EvenOrOdd;

public final class Engine {
    private Engine() {
        throw new IllegalStateException("Utility class");
    }

    public static void runSelectedGame(final int selectedGame) {
        switch (selectedGame) {
            case 2:
                EvenOrOdd.run();
                break;
            default:
                break;
        }
    }
}
