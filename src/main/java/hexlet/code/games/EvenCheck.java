package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {

    static String[][] arrayOfQuestionsAndAnswers = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.",arrayOfQuestionsAndAnswers);
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum = Engine.getRandomNum(Engine.RANDOM_RANGE);
            arrayOfQuestionsAndAnswers[i][0] = Integer.toString(randomNum);
            arrayOfQuestionsAndAnswers[i][1] = randomNum % 2 == 0 ? Engine.POSITIVE : Engine.NEGATIVE;
        }
    }


}
