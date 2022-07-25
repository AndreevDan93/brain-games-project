package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;
import hexlet.code.games.GreatestCommonDivisor;


public class App {
    public static void main(String[] args) {
        int inputNum;
        final int exit = 0;
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");

        inputNum = Engine.getScanner().nextInt();
        System.out.println("Your choice: " + inputNum);

        switch (inputNum) {
            case exit:
                return;
            case greet:
                Cli.greeting();
                break;
            case even:
                EvenCheck.game();
                break;
            case calc:
                Calculator.game();
                break;
            case gcd:
                GreatestCommonDivisor.game();
                break;
            default:
                break;
        }
    }


}
