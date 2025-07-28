package hexlet.code;

public final class Games {
    private Games() {
        throw new IllegalStateException("Utility class");
    }

    public static void evenOrOdd() {
        System.out.println("Answer 'yes' if the number is even, otherwise 'no'");

        final int maxGameScore = 3;
        final int maxBound = 50;
        int score = 0;
        while (score < maxGameScore) {
            int randomNumber = App.RANDOM.nextInt(maxBound);
            System.out.println("Question: " + randomNumber);
            boolean isEven = randomNumber % 2 == 0;

            System.out.print("Your answer: ");
            String answer = App.SCANNER.nextLine();

            if (isEven) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + answer + "' is not a valid answer ;(. Correct answer was `yes`");
                    System.out.println("Let's try again, " + App.userName + "!");
                    score = 0;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("'" + answer + "' is not a valid answer ;(. Correct answer was `no`");
                    System.out.println("Let's try again, " + App.userName + "!");
                    score = 0;
                }
            }
        }

        System.out.println("Congratulations, " + App.userName + "!");
    }

    public static void calculateGame() {
        return;
    }
}
