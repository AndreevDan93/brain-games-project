package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class PrimeNumber {

    private static final String[][] ARRAY_OF_QUESTIONS_AND_ANSWERS =
            new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        generateGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.", ARRAY_OF_QUESTIONS_AND_ANSWERS);
    }


    private static void generateGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int randomNumber = Engine.getRandomNum(Engine.RANDOM_RANGE);
            String correctAnswer = isPrimeNumber(randomNumber);

            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][0] = Integer.toString(randomNumber);
            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][1] = correctAnswer;

        }
    }

    private static String isPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? Engine.POSITIVE : Engine.NEGATIVE;
    }

}
