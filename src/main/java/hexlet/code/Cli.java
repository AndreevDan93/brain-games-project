package hexlet.code;


public class Cli {
    public static void greeting() {
        String name;
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        name = Engine.getScanner().next();
        System.out.println("Hello, " + name + "!");
    }
}
