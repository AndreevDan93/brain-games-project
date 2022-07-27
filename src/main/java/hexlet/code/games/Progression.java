package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {

    private static final String GAME_CONDITIONS = "What number is missing in the progression?";
    private static final int ARR_LENGTH = 10;

    public static void game() {
        Engine.gameLogic(GAME_CONDITIONS, generateGameData());
    }

    private static String[][] generateGameData() {
        String[][] arrayOfData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] progression = new String[ARR_LENGTH];
            int progressionStep = Engine.getRandomNum(Engine.RANDOM_RANGE);
            int randomIndex = Engine.getRandomNum(progression.length - 1);

            addArrayToProgressionData(progression, progressionStep);

            arrayOfData[i][1] = progression[randomIndex];
            progression[randomIndex] = "..";

            arrayOfData[i][0] = String.join(" ", progression);
        }
        return arrayOfData;
    }

    private static void addArrayToProgressionData(String[] progression, int progressionStep) {
        progression[0] = Integer.toString(Engine.getRandomNum(Engine.RANDOM_RANGE));
        for (int j = 1; j < progression.length; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + progressionStep);
        }
    }


}
