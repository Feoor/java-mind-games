package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD implements Game {
    private static final int MAX_BOUND = 50;
    private String answer;

    private static int gcd(final int a, final int b) {
        int x = a;
        int y = b;

        if (y == 0) {
            return x;
        }

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }

    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public String getNextQuestion() {
        int firstNumber = Engine.getRandomNumber(MAX_BOUND);
        int secondNumber = Engine.getRandomNumber(MAX_BOUND);
        answer = String.valueOf(gcd(firstNumber, secondNumber));

        return firstNumber + " " + secondNumber;
    }
    public boolean checkAnswer(final String userAnswer) {
        return userAnswer.equals(answer);
    }
    public String getAnswer() {
        return answer;
    }
}
