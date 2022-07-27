package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {
    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.");
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum = Engine.getRandomNum(Engine.RANDOM_RANGE);
            Engine.getArrCorrectAnswers()[i] = randomNum % 2 == 0 ? Engine.POSITIVE : Engine.NEGATIVE;
            Engine.getArrQuestions()[i] = Integer.toString(randomNum);
        }
    }


}
