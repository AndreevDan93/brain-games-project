package hexlet.code.games;

import hexlet.code.Engine;

public class GreatestCommonDivisor {

    private static final String GAME_CONDITIONS = "Find the greatest common divisor of given numbers.";
    public static void runGame() {
        Engine.gameLogic(GAME_CONDITIONS, generateGameData());
    }

    private static String[][] generateGameData() {
        String[][] arrayOfData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum1 = Engine.getRandomNum(Engine.RANDOM_RANGE);
            int randomNum2 = Engine.getRandomNum(Engine.RANDOM_RANGE);

            arrayOfData[i][0] = randomNum1 + " " + randomNum2;
            arrayOfData[i][1] = Integer.toString(getGreatestCommonDivisor(randomNum1, randomNum2));
        }
        return arrayOfData;
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
