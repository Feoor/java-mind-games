package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");

        Scanner sc = new Scanner(System.in);
        String name = Cli.getName(sc);
        System.out.println("Hello, " + name);
        sc.close();
    }
}
