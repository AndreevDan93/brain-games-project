package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class PrimeNumber {
    public static void game() {
        Engine.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        addArrayToGameData();
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            int randomNumber = Engine.getRandomNum(Engine.getRandomRange());
            String correctAnswer = isPrimeNumber(randomNumber);

            Engine.getArrQuestions()[i] = Integer.toString(randomNumber);
            Engine.getArrCorrectAnswers()[i] = correctAnswer;

        }
    }

    private static String isPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? "yes" : "no";
    }

}
