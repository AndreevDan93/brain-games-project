package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class PrimeNumber {

    static String[][] arrayOfQuestionsAndAnswers = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.",arrayOfQuestionsAndAnswers);
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int randomNumber = Engine.getRandomNum(Engine.RANDOM_RANGE);
            String correctAnswer = isPrimeNumber(randomNumber);

            arrayOfQuestionsAndAnswers[i][0] = Integer.toString(randomNumber);
            arrayOfQuestionsAndAnswers[i][1] = correctAnswer;

        }
    }

    private static String isPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? Engine.POSITIVE : Engine.NEGATIVE;
    }

}
