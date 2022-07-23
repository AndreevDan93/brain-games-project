package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;


public class App {
    public static void main(String[] args) {
        int inputNum;

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");

        inputNum = Engine.getScanner().nextInt();
        System.out.println("Your choice: " + inputNum);

        switch (inputNum) {
            case 0:
                return;
            case 1:
                Cli.greeting();
                break;
            case 2:
                EvenCheck.game();
                break;
            case 3:
                Calculator.game();
                break;
            default:
                break;
        }
    }


}
