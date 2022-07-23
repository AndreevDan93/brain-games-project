package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final int COUNT_OF_RANGES = 3;
    private static final int RANDOM_RANGE = 100;
    private static String playerName;

    private static String[] arrCorrectAnswers = new String[Engine.getCountOfRounds()];
    private static String[] arrQuestions = new String[Engine.getCountOfRounds()];


    public static String[] getArrCorrectAnswers() {
        return arrCorrectAnswers;
    }

    public static String[] getArrQuestions() {
        return arrQuestions;
    }

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
        SCANNER.nextLine();
        playerName = SCANNER.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getRandomNum(int randomRange) {
        return RANDOM.nextInt(randomRange);
    }

    public static String getQuestionForm(String question) {
        return "Question: " + question;
    }

    public static void gameAlgorithm(String[] correctAnswers, String[] questions) {
        boolean isWin = true;
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            System.out.println(questions[i]);

            String correctAnswer = correctAnswers[i];
            String inputAnswer = getScanner().nextLine();

            if (correctAnswer.equals(inputAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'. Let's try again, "
                        + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }


}
