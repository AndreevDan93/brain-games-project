package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class PrimeNumber {

    private static final String GAME_CONDITIONS = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void game() {
        Engine.gameLogic(GAME_CONDITIONS, generateGameData());
    }

    private static String[][] generateGameData() {
        String[][] arrayOfData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int randomNumber = Engine.getRandomNum(Engine.RANDOM_RANGE);
            String correctAnswer = isPrimeNumber(randomNumber);

            arrayOfData[i][0] = Integer.toString(randomNumber);
            arrayOfData[i][1] = correctAnswer;
        }
        return arrayOfData;
    }

    private static String isPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? Engine.POSITIVE : Engine.NEGATIVE;
    }

}
