package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final int COUNT_OF_RANGES = 3;
    private static final int RANDOM_RANGE = 100;
    private static String playerName;

    private static final String[] arrCorrectAnswers = new String[Engine.getCountOfRounds()];
    private static final String[] arrQuestions = new String[Engine.getCountOfRounds()];


    public static String[] getArrCorrectAnswers() {
        return arrCorrectAnswers;
    }

    public static String[] getArrQuestions() {
        return arrQuestions;
    }

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static int getCountOfRounds() {
        return COUNT_OF_RANGES;
    }

    public static int getRandomRange() {
        return RANDOM_RANGE;
    }

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        SCANNER.nextLine();
        playerName = SCANNER.next();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getRandomNum(int randomRange) {
        return RANDOM.nextInt(randomRange);
    }

    public static void gameAlgorithm(String[] correctAnswers, String[] questions) {
        boolean isWin = true;
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            System.out.println("Question: " + questions[i]);

            String correctAnswer = correctAnswers[i];
            System.out.print("Your answer: ");
            String inputAnswer = getScanner().next();

            if (correctAnswer.equals(inputAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'. Let's try again, "
                        + Engine.playerName + "!");
                isWin = false;
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }


}
