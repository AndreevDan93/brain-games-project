package hexlet.code.games;

import hexlet.code.Engine;


public class Calculator {
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final String[][] ARRAY_OF_QUESTIONS_AND_ANSWERS =
            new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_ANSWER_OPTIONS];

    public static void game() {
        generateGameData();
        Engine.gameLogic("What is the result of the expression?", ARRAY_OF_QUESTIONS_AND_ANSWERS);
    }

    private static void generateGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String randomExpression = getRandomExpression();
            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][0] = randomExpression;
            ARRAY_OF_QUESTIONS_AND_ANSWERS[i][1] = Integer.toString(getResultOfRandomExpression(randomExpression));
        }
    }

    private static String getRandomOperation() {
        int i = Engine.getRandomNum(OPERATIONS.length);
        return OPERATIONS[i];
    }

    private static String getRandomExpression() {
        int num1 = Engine.getRandomNum(Engine.RANDOM_RANGE);
        int num2 = Engine.getRandomNum(Engine.RANDOM_RANGE);
        String operation = getRandomOperation();
        return num1 + " " + operation + " " + num2;
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
