package hexlet.code;

import hexlet.code.games.EvenOrOdd;
import hexlet.code.games.CalculateGame;

public final class Engine {
    private Engine() {
        throw new IllegalStateException("Utility class");
    }

    public static void runSelectedGame(final int selectedGame) {
        switch (selectedGame) {
            case 2:
                EvenOrOdd.run();
                break;
            case 3:
                CalculateGame.run();
                break;
            default:
                break;
        }
    }
}
