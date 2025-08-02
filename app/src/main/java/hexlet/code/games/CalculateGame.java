package hexlet.code.games;

import hexlet.code.Engine;

public final class CalculateGame implements Game {
    private static final int MAX_BOUND = 25;
    private final char[] expressions = {'+', '-', '*'};
    private String answer;

    public String getDescription() {
        return "What is the result of the expression?";
    }
    public String getNextQuestion() {
        int firstNumber = Engine.getRandomNumber(MAX_BOUND);
        int secondNumber = Engine.getRandomNumber(MAX_BOUND);
        char randomExpression = expressions[Engine.getRandomNumber(expressions.length)];

        int answerInt = switch (randomExpression) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default ->
                // By default, is addition
                firstNumber + secondNumber;
        };
        answer = String.valueOf(answerInt);

        return firstNumber + " " + randomExpression + " " + secondNumber;
    }
    public boolean checkAnswer(final String userAnswer) {
        return userAnswer.equals(answer);
    }

    public String getAnswer() {
        return answer;
    }
}
