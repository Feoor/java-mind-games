package hexlet.code.games;

import hexlet.code.Engine;

public class Prime implements Game {
    private boolean isPrime;

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String getDescription() {
        return "Answer 'yes' if the number is prime, otherwise 'no'";
    }
    public String getNextQuestion() {
        final int maxBound = 50;
        int randomNumber = Engine.getRandomNumber(maxBound);
        this.isPrime = isPrime(randomNumber);

        return String.valueOf(randomNumber);
    }
    public boolean checkAnswer(String userAnswer) {
        return isPrime && userAnswer.equals("yes") || !isPrime && userAnswer.equals("no");
    }
    public String getAnswer() {
        return isPrime ? "yes" : "no";
    }
}
