package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {

    private static final int ARR_LENGTH = 10;

    public static void game() {
        Engine.greeting();
        System.out.println("AWhat number is missing in the progression?");
        addArrayToGameData();
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());
    }

    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            String[] progression = new String[ARR_LENGTH];
            int progressionStep = Engine.getRandomNum(Engine.getRandomRange());
            int randomIndex = Engine.getRandomNum(progression.length - 1);

            addArrayToProgressionData(progression, progressionStep);

            Engine.getArrCorrectAnswers()[i] = progression[randomIndex];
            progression[randomIndex] = "..";


            Engine.getArrQuestions()[i] = String.join(" ", progression);
        }
    }

    private static void addArrayToProgressionData(String[] progression, int progressionStep) {
        for (int j = 0; j < progression.length; j++) {
            if (j == 0) {
                progression[j] = Integer.toString(Engine.getRandomNum(Engine.getRandomRange()));
            } else {
                progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + progressionStep);
            }
        }
    }


}
