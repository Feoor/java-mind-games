package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    private static final Random RANDOM = new Random();
    private final Scanner scanner;
    private final String name;

    Games(Scanner scanner, String name) {
        this.scanner = scanner;
        this.name = name;
    }

    public void evenOrOdd() {
        System.out.println("Answer 'yes' if the number is even, otherwise 'no'");

        final int maxGameScore = 3;
        for (int score = 0; score < maxGameScore;) {
            int randomNumber = RANDOM.nextInt(50);
            System.out.println("Question: " + randomNumber);
            boolean isEven = randomNumber % 2 == 0;

            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (isEven) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + answer + "' is not a valid answer ;(. Correct answer was `yes`");
                    System.out.println("Let's try again, " + name + "!");
                    score = 0;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + answer + "' is not a valid answer ;(. Correct answer was `no`");
                    System.out.println("Let's try again, " + name + "!");
                    score = 0;
                }
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
