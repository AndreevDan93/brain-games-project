package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;


public class App {
    static final int EXIT = 0;
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;

    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        System.out.print("Your choice: ");
        int inputNum = Engine.SCANNER.nextInt();


        switch (inputNum) {
            case EXIT:
                return;
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                EvenCheck.runGame();
                break;
            case CALC:
                Calculator.runGame();
                break;
            case GCD:
                GreatestCommonDivisor.runGame();
                break;
            case PROGRESSION:
                Progression.runGame();
                break;
            case PRIME:
                PrimeNumber.runGame();
                break;
            default:
                throw new RuntimeException("The game at number " + inputNum + " is not found");
        }
    }


}
