package hexlet.code.games;

import hexlet.code.Engine;


public class Calculator {
    private static final String GAME_CONDITIONS = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    public static void game() {
        Engine.gameLogic(GAME_CONDITIONS, generateGameData());
    }

    private static String[][] generateGameData() {
        String[][] arrayOfData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String randomExpression = getRandomExpression();
            arrayOfData[i][0] = randomExpression;
            arrayOfData[i][1] = Integer.toString(getResultOfRandomExpression(randomExpression));
        }
        return arrayOfData;
    }

    private static String getRandomExpression() {
        int num1 = Engine.getRandomNum(Engine.RANDOM_RANGE);
        int num2 = Engine.getRandomNum(Engine.RANDOM_RANGE);
        String randomOperation = OPERATIONS[Engine.getRandomNum(OPERATIONS.length)];
        return num1 + " " + randomOperation + " " + num2;
    }

    private static int getResultOfRandomExpression(String randomExpression) {
        String[] expression = randomExpression.split(" ");
        return switch (expression[1]) {
            case "+" -> Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
            case "-" -> Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
            case "*" -> Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
            default -> throw new RuntimeException("Invalid Operation");
        };
    }

}
