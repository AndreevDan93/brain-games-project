package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int COUNT_OF_RANGES = 3;
    private static final int RANDOM_RANGE = 100;
    private static String playerName;

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static int getCountOfRounds() {
        return COUNT_OF_RANGES;
    }

    public static int getRandomRange() {
        return RANDOM_RANGE;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        playerName = SCANNER.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getRandomNum(int randomRange) {
        return RANDOM.nextInt(randomRange);
    }

    public static String getRandomOperation() {
        String[] operations = {"+", "-", "*"};
        int i = getRandomNum(operations.length);
        return operations[i];
    }


}
