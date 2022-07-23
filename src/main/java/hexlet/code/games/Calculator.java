package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Calculator {
    public static void game() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        boolean isWin = true;
        for (int i = 0; i < Engine.getCountOfRounds(); i++) {

            String randomExpression = getRandomExpression();
            System.out.println("Question: " + randomExpression);
            int answer = Engine.scanner.nextInt();
            int correctAnswer = getResultOfRandomExpression(randomExpression);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'\n", answer, correctAnswer);
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                isWin = false;
                break;
            }
        }
        if (isWin) {
            System.out.println("Congratulations, Sam!");
        }
    }

    public static String getRandomExpression() {
        int num1 = Engine.getRandomNum(Engine.getRandomRange());
        int num2 = Engine.getRandomNum(Engine.getRandomRange());
        String operation = Engine.getRandomOperation();
        String result = num1 + " " + operation + " " + num2;
        return result;
    }

    public static int getResultOfRandomExpression(String randomExpression) {
        String[] expression = randomExpression.split(" ");
        int result = 0;
        switch (expression[1]) {
            case "+":
                result = Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
                break;
            case "-":
                result = Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
                break;
            case "*":
                result = Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
                break;
            default:
                break;
        }
        return result;
    }


}
