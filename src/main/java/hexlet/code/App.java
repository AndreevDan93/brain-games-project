package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.ParityCheckGame;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,UTF_8.name());
        int inputNum;
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        inputNum = scanner.nextInt();
        System.out.println("Your choice: " + inputNum);
        if (inputNum == 0) {
            return;
        }
        if (inputNum == 1) {
            Cli.greeting();
        }
        if (inputNum == 2) {
            ParityCheckGame.game();
        }
        if (inputNum == 3) {
            Calculator.game();
        }


    }
}
