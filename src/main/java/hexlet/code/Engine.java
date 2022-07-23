package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Engine {
    public static Scanner scanner = new Scanner(System.in, UTF_8.name());
    static Random random = new Random();
    private static int countOfRounds = 3;
    private static int randomRange = 100;
    private static String playerName;

    public static String getPlayerName() {
        return playerName;
    }

    public static int getCountOfRounds() {
        return countOfRounds;
    }

    public static int getRandomRange() {
        return randomRange;
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in, UTF_8.name());
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        playerName= scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getRandomNum(int randomRange) {
        int a = random.nextInt(randomRange);
        return a;
    }

    public static String getRandomOperation() {
        String[] operations = {"+", "-", "*"};
        int i = getRandomNum(operations.length);
        return operations[i];
    }


}
