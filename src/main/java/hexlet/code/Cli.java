package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getName(Scanner sc) {
        System.out.print("May I have your name? ");
        return sc.nextLine();
    }
}
