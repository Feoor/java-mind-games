package hexlet.code.games;

public interface Game {
    String getDescription();
    String getNextQuestion();
    boolean checkAnswer(String userAnswer);
    String getAnswer();
}
