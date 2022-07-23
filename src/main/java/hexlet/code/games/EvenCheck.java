package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {

    public static void game() {
        boolean isWin = true;
        Engine.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            int randomNum = Engine.getRandomNum(Engine.getRandomRange());
            System.out.println("Question: " + randomNum);

            String inputAnswer = Engine.getScanner().nextLine();
            boolean evenCheck = randomNum % 2 == 0;

            if ((evenCheck && inputAnswer.equals("yes")) || (!evenCheck && inputAnswer.equals("no"))) {
                System.out.println("Correct!");
            } else if (evenCheck) {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'yes'. Let's try again, "
                        + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            } else {
                System.out.println("'" + inputAnswer + "' "
                        + "is wrong answer ;(. Correct answer was 'no'. Let's try again, "
                        + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + Engine.getPlayerName() + "!");
        }

    }
}
