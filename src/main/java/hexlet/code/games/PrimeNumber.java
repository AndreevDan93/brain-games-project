package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class PrimeNumber {
    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.");
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int randomNumber = Engine.getRandomNum(Engine.RANDOM_RANGE);
            String correctAnswer = isPrimeNumber(randomNumber);

            Engine.getArrQuestions()[i] = Integer.toString(randomNumber);
            Engine.getArrCorrectAnswers()[i] = correctAnswer;

        }
    }

    private static String isPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? Engine.POSITIVE : Engine.NEGATIVE;
    }

}
