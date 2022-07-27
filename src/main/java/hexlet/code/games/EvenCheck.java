package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {

    private static final String[][] ARRAY_OF_QUESTIONS_AND_ANSWERS =
            new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        generateGameData();
        Engine.gameLogic("Answer 'yes' if number even otherwise answer 'no'.", ARRAY_OF_QUESTIONS_AND_ANSWERS);
    }


    private static void generateGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum = Engine.getRandomNum(Engine.RANDOM_RANGE);
            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][0] = Integer.toString(randomNum);
            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][1] = randomNum % 2 == 0 ? Engine.POSITIVE : Engine.NEGATIVE;
        }
    }


}
