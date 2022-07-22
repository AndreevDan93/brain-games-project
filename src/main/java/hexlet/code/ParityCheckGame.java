package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ParityCheckGame {
    public static void game() {

        Scanner scanner = new Scanner(System.in,UTF_8.name());
        Random random = new Random();
        int countCorrectAnswer = 0;
        Cli.greeting();
        int countForWin = 3;
        int randomRange = 100;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 1; i <= countForWin; i++) {

            int randomNum = random.nextInt(randomRange);
            boolean flag = randomNum % 2 == 0;
            System.out.println("Question: " + randomNum);
            String inputAnswer = scanner.nextLine();
            if ((flag && inputAnswer.equals("yes")) || (!flag && inputAnswer.equals("no"))) {
                System.out.println("Correct!");
                countCorrectAnswer++;
                continue;
            }
            if (flag && !inputAnswer.equals("yes")) {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'no'. Let's try again, " + Cli.getName() + "!");
                break;
            }
            if (!flag && !inputAnswer.equals("no")) {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'yes'. Let's try again, " + Cli.getName() + "!");
                break;
            }

        }

        if (countCorrectAnswer == countForWin) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
            countCorrectAnswer = 0;
        }

    }
}
