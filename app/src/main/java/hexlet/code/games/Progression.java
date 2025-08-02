package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression implements Game {
    private static final int MAX_INIT_BOUND = 30;
    private static final int MAX_STEP_BOUND = 15;
    private static final int PROGRESSION_ARRAY_SIZE = 10;
    private String answer;

    private static int[] getProgression(final int init, final int step) {
        int[] numbers = new int[PROGRESSION_ARRAY_SIZE];
        numbers[0] = init;
        for (int i = 1; i < PROGRESSION_ARRAY_SIZE; i++) {
            numbers[i] = numbers[i - 1] + step;
        }

        return numbers;
    }
    private static String getQuestionString(final int[] numbers, final int hiddenIndex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(numbers[i]).append(" ");
            }
        }

        return sb.toString();
    }

    public String getDescription() {
        return "What number is missing in the progression?";
    }
    public String getNextQuestion() {
        int initNumber = Engine.getRandomNumber(MAX_INIT_BOUND);
        int stepNumber = Engine.getRandomNumber(MAX_STEP_BOUND);

        int[] numbersProgression = getProgression(initNumber, stepNumber);

        int randomHiddenNumber = Engine.getRandomNumber(numbersProgression.length);
        answer = String.valueOf(numbersProgression[randomHiddenNumber]);

        return getQuestionString(numbersProgression, randomHiddenNumber);
    }
    public boolean checkAnswer(final String userAnswer) {
        return userAnswer.equals(answer);
    }
    public String getAnswer() {
        return answer;
    }
}
