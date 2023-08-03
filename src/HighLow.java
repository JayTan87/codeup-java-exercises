import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        String userConfirm;
//        do {
        System.out.println("Please enter a number to begin the high low game: ");
        int userInput = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (userInput == rand) {
                System.out.println("Congratulations you have won the game!");
                System.out.println("Would you like to play again? (Y/N)");
                userConfirm = scanner2.next();
                if (userConfirm.equalsIgnoreCase("Y")) {
                    i = 0;
                    System.out.println("Please enter a new number: ");
                    userInput = scanner.nextInt();
                } else {
                    break;
                }
            } else if (userInput > rand) {
                System.out.println("Lower!");
                System.out.println("Please try again!");
                userInput = scanner.nextInt();

            } else {
                System.out.println("Higher!");
                System.out.println("Please try again!");
                userInput = scanner.nextInt();
            }
            if (i == 4) {
                System.out.println("Sorry you lost the game. Would you like to play again? (Y/N)");
                userConfirm = scanner2.next();
                if (userConfirm.equalsIgnoreCase("Y")) {
                    i = 0;
                    System.out.println("Please enter a new number: ");
                    userInput = scanner.nextInt();
                }
            }

        }
//        }
//        while (userConfirm.equalsIgnoreCase("Y"));

    }
}