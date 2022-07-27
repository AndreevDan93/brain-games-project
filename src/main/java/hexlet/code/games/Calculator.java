package hexlet.code.games;

import hexlet.code.Engine;


public class Calculator {
    static final String[] OPERATIONS = {"+", "-", "*"};

    public static void game() {
        addArrayToGameData();
        Engine.gameLogic("What is the result of the expression?");
    }

    private static void addArrayToGameData() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String randomExpression = getRandomExpression();
            Engine.getArrCorrectAnswers()[i] = Integer.toString(getResultOfRandomExpression(randomExpression));
            Engine.getArrQuestions()[i] = randomExpression;
        }
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

    private static String getRandomOperation() {
        int i = Engine.getRandomNum(OPERATIONS.length);
        return OPERATIONS[i];
    }


}
