package hexlet.code.games;

import hexlet.code.Engine;

public class CalculateGame implements Game {
    private final char[] expressions = {'+', '-', '*'};
    private String answer;

    public String getDescription() {
        return "What is the result of the expression?";
    }
    public String getNextQuestion() {
        int maxBound = 25;
        int firstNumber = Engine.getRandomNumber(maxBound);
        int secondNumber = Engine.getRandomNumber(maxBound);
        char randomExpression = expressions[Engine.getRandomNumber(expressions.length)];

        answer = String.valueOf(switch (randomExpression) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default ->
                // By default, is addition
                firstNumber + secondNumber;
        });

        return firstNumber + " " + randomExpression + " " + secondNumber;
    }
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(answer);
    }

    public String getAnswer() {
        return answer;
    }
}
