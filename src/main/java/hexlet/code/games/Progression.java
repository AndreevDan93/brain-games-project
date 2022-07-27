package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {

    private static final int ARR_LENGTH = 10;
    private static final String[][] ARRAY_OF_QUESTIONS_AND_ANSWERS =
            new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        generateGameData();
        Engine.gameLogic("What number is missing in the progression?", ARRAY_OF_QUESTIONS_AND_ANSWERS);
    }

    private static void generateGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] progression = new String[ARR_LENGTH];
            int progressionStep = Engine.getRandomNum(Engine.RANDOM_RANGE);
            int randomIndex = Engine.getRandomNum(progression.length - 1);

            addArrayToProgressionData(progression, progressionStep);

            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][1] = progression[randomIndex];
            progression[randomIndex] = "..";

            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][0] = String.join(" ", progression);
        }
    }

    private static void addArrayToProgressionData(String[] progression, int progressionStep) {
        progression[0] = Integer.toString(Engine.getRandomNum(Engine.RANDOM_RANGE));
        for (int j = 1; j < progression.length; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + progressionStep);
        }
    }


}
