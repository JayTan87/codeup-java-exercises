import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userInput;
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
        do {
            System.out.println("Talk to Bob!");
            String userResponseOne = scanner.nextLine();
            if (userResponseOne.endsWith("?")) {
                System.out.println("Sure");
            } else if (userResponseOne.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponseOne.equals("")) {
                System.out.println("Fine. Be that way!");
            } else
                System.out.println("Whatever");
        System.out.println("Would you like to talk to Bob more? (Y/N)");
        userInput = scanner2.next();
        }
        while(userInput.equalsIgnoreCase("y"));
    }
}
