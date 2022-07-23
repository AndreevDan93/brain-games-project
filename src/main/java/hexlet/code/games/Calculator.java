package hexlet.code.games;

import hexlet.code.Engine;


public class Calculator {
    public static void game() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        addArrayToGameData();
        Engine.gameAlgorithm(Engine.getArrCorrectAnswers(), Engine.getArrQuestions());
    }

    public static void addArrayToGameData() {
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {
            String randomExpression = getRandomExpression();
            Engine.getArrCorrectAnswers()[i] = Integer.toString(getResultOfRandomExpression(randomExpression));
            Engine.getArrQuestions()[i] = Engine.getQuestionForm(randomExpression);
        }
    }

    public static String getRandomExpression() {
        int num1 = Engine.getRandomNum(Engine.getRandomRange());
        int num2 = Engine.getRandomNum(Engine.getRandomRange());
        String operation = getRandomOperation();
        return num1 + " " + operation + " " + num2;
    }

    public static int getResultOfRandomExpression(String randomExpression) {
        String[] expression = randomExpression.split(" ");

        return switch (expression[1]) {
            case "+" -> Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
            case "-" -> Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
            case "*" -> Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
            default -> 0;
        };
    }

    public static String getRandomOperation() {
        String[] operations = {"+", "-", "*"};
        int i = Engine.getRandomNum(operations.length);
        return operations[i];
    }


}
