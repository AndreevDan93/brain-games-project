package hexlet.code;


public class Cli {
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String name = Engine.SCANNER.next();
        System.out.println("Hello, " + name + "!");
    }
}
