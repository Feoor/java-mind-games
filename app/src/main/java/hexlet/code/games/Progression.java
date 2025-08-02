package hexlet.code.games;

import hexlet.code.Engine;

public class Progression implements Game {
    private String answer;

    private static int[] getProgression(final int init, final int step, final int size) {
        int[] numbers = new int[size];
        numbers[0] = init;
        for (int i = 1; i < size; i++) {
            numbers[i] = numbers[i - 1] + step;
        }

        return numbers;
    }
    private static String getQuestionString(final int[] numbers, final int hiddenIndex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i == hiddenIndex) {
                sb.append("... ");
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
        int maxInitBound = 25;
        int maxStepBound = 10;
        int initNumber = Engine.getRandomNumber(maxInitBound);
        int stepNumber = Engine.getRandomNumber(maxStepBound);

        int arraySize = 10;
        int[] numbersProgression =  getProgression(initNumber, stepNumber, arraySize);

        int randomHiddenNumber = Engine.getRandomNumber(numbersProgression.length);
        answer = String.valueOf(numbersProgression[randomHiddenNumber]);

        return getQuestionString(numbersProgression, randomHiddenNumber);
    }
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(answer);
    }
    public String getAnswer() {
        return answer;
    }
}
