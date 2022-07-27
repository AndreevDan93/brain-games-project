package hexlet.code.games;

import hexlet.code.Engine;

public class GreatestCommonDivisor {

    static String[][] arrayOfQuestionsAndAnswers = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("Find the greatest common divisor of given numbers.",arrayOfQuestionsAndAnswers);
    }

    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum1 = Engine.getRandomNum(Engine.RANDOM_RANGE);
            int randomNum2 = Engine.getRandomNum(Engine.RANDOM_RANGE);

            arrayOfQuestionsAndAnswers[i][0] = randomNum1 + " " + randomNum2;
            arrayOfQuestionsAndAnswers[i][1] = Integer.toString(getGreatestCommonDivisor(randomNum1, randomNum2));
        }
    }

    private static int getGreatestCommonDivisor(int num1, int num2) {
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
