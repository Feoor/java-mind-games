package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements Game {
    private String answer;

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public String getNextQuestion() {
        int maxBound = 50;
        int firstNumber = Engine.getRandomNumber(maxBound);
        int secondNumber = Engine.getRandomNumber(maxBound);
        answer = String.valueOf(gcd(firstNumber, secondNumber));

        return firstNumber + " " + secondNumber;
    }
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(answer);
    }
    public String getAnswer() {
        return answer;
    }
}
