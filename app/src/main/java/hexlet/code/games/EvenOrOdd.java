package hexlet.code.games;

import hexlet.code.Engine;

public final class EvenOrOdd implements Game {
    private boolean isEven;

    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String getNextQuestion() {
        final int maxBound = 50;
        int randomNumber = Engine.getRandomNumber(maxBound);
        isEven = (randomNumber % 2 == 0);

        return String.valueOf(randomNumber);
    }
    public boolean checkAnswer(final String userAnswer) {
        return isEven && userAnswer.equals("yes") || !isEven && userAnswer.equals("no");
    }
    public String getAnswer() {
        return isEven ? "yes" : "no";
    }
}
