import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.\n",pi);
//        Scanner scanner0 = new Scanner(System.in);
//
//        System.out.println("Please enter a number");
//        int userInput = scanner0.nextInt();


//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int userInput = scanner1.nextInt();
//        System.out.println("Your entered number is: " + userInput);
//
//        System.out.println("Please enter 3 words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Please enter a sentence: ");
//        String userSentence = scanner2.nextLine();
//        System.out.println("The sentence entered was: " + userSentence);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please the first number");
        String userDimension1 = scanner3.nextLine();
        System.out.println("Please the second number");
        String userDimension2 = scanner3.nextLine();
        int userValue1 = Integer.parseInt(userDimension1);
        int userValue2 = Integer.parseInt(userDimension2);
        System.out.println(userValue1 * userValue2);
        System.out.println((userValue1* 2) + (userValue2 * 2));
    }
}
