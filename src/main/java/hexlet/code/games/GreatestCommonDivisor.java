package hexlet.code.games;

import hexlet.code.Engine;

public class GreatestCommonDivisor {
    public static void game() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        addArrayToGameData();
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());

    }

    public static void addArrayToGameData() {
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            int randomNum1 = Engine.getRandomNum(Engine.getRandomRange());
            int randomNum2 = Engine.getRandomNum(Engine.getRandomRange());

            Engine.getArrCorrectAnswers()[i] = Integer.toString(getGreatestCommonDivisor(randomNum1, randomNum2));
            Engine.getArrQuestions()[i] = randomNum1 + " " + randomNum2;
        }
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }


}
