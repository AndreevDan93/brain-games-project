package hexlet.code.games;

import hexlet.code.Engine;


public class EvenCheck {
    public static void game() {
        Engine.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        addArrayToGameData();
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());
    }


    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            int randomNum = Engine.getRandomNum(Engine.getRandomRange());
            Engine.getArrCorrectAnswers()[i] = randomNum % 2 == 0 ? "yes" : "no";
            Engine.getArrQuestions()[i] = Integer.toString(randomNum);
        }
    }


}
