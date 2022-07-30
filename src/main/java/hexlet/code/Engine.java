package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int RANDOM_RANGE = 100;
    public static final int COUNT_ANSWER_OPTIONS = 2;


    public static int getRandomNum(int randomRange) {
        return RANDOM.nextInt(randomRange);
    }

    public static void gameLogic(String gameConditions, String[][] questionsAndAnswers) {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        SCANNER.nextLine();
        String playerName = SCANNER.next();
        System.out.println("Hello, " + playerName + "!");

        System.out.println(gameConditions);

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);

            String correctAnswer = questionsAndAnswers[i][1];
            System.out.print("Your answer: ");
            String inputAnswer = SCANNER.next();

            if (correctAnswer.equals(inputAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'. Let's try again, "
                        + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }


}
