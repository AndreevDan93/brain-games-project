package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {

    private static final String GAME_CONDITIONS = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final String POSITIVE = "yes";
    private static final String NEGATIVE = "no";

    public static void runGame() {
        Engine.gameLogic(GAME_CONDITIONS, generateGameData());
    }


    private static String[][] generateGameData() {
        String[][] arrayOfData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNum = Engine.getRandomNum(Engine.RANDOM_RANGE);
            arrayOfData[i][0] = Integer.toString(randomNum);
            arrayOfData[i][1] = randomNum % 2 == 0 ? POSITIVE : NEGATIVE;
        }
        return arrayOfData;
    }


}
