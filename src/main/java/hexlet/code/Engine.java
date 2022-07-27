package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static final int COUNT_OF_ROUNDS = 3;
    public static final int RANDOM_RANGE = 100;
    public static final String POSITIVE = "yes";
    public static final String NEGATIVE = "no";
    private static String playerName;

    private static final String[] ARR_CORRECT_ANSWER = new String[COUNT_OF_ROUNDS];
    private static final String[] ARR_QUESTIONS = new String[COUNT_OF_ROUNDS];


    public static String[] getArrCorrectAnswers() {
        return ARR_CORRECT_ANSWER;
    }

    public static String[] getArrQuestions() {
        return ARR_QUESTIONS;
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

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            System.out.println("Question: " + questions[i]);

            String correctAnswer = correctAnswers[i];
            System.out.print("Your answer: ");
            String inputAnswer = SCANNER.next();

            if (correctAnswer.equals(inputAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'. Let's try again, "
                        + Engine.playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");

    }

    public static void gameLogic(String gameConditions) {
        Engine.greeting();
        System.out.println(gameConditions);
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());
    }


}
