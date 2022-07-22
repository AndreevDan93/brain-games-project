package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
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


    }
}
