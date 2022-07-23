package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ParityCheckGame {

    public static void game() {
        boolean isWin = true;
        Engine.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            int randomNum = Engine.getRandomNum(Engine.getRandomRange());
            boolean flag = randomNum % 2 == 0;
            System.out.println("Question: " + randomNum);
            String inputAnswer = Engine.scanner.nextLine();

            if ((flag && inputAnswer.equals("yes")) || (!flag && inputAnswer.equals("no"))) {
                System.out.println("Correct!");
                continue;
            }
            if (flag && !inputAnswer.equals("yes")) {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'no'. Let's try again, " + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            }
            if (!flag && !inputAnswer.equals("no")) {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'yes'. Let's try again, " + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + Engine.getPlayerName() + "!");
        }

    }
}
