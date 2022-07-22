package hexlet.code;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Cli {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in,UTF_8.name());
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
