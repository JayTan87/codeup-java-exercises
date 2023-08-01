import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//    int x = 5;

//    while(x <= 15) {
//        System.out.println(x);
//        x++;
//    }
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        };
//        for(int y = 2; y <= 1000000; y*=2){
//            System.out.println(y);
//        }
//    int y = 2;
//    do {
//        System.out.println(y);
//        y *= 2;
//    }
//    while(y <= 1000000);
//        for(int i = 0; i <= 100; i++) {
//            if((i % 3 == 0) && (i % 5 ==0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else
//                System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please the number you would like the multiplication table to stop at");
//        int userNum = scanner.nextInt();
//        String number = "number";
//        String squared = "squared";
//        String cubed = "cubed";
//        String userInput;
//        int i;
////        int userNumSquared = i * i;
//        int userNumCubed = userNum * userNum * userNum;
////
//        do {
//            System.out.println("Here is Your Table!");
//            System.out.printf("%5s | %5s | %5s \n", number, squared, cubed);
//            System.out.println("------ | ------- | -----");
//            for (i = 0; i <= userNum; i++) {
//                System.out.printf("%-6s | %-7s | %-5s \n", i, (i * i), (i * i * i));
//            }
//            System.out.println("Would you like to continue? (Y/N)");
//            userInput = scanner.next();
//            if (userInput.equals("Y")) {
//                userNum++;
//            }
//        }
//        while (userInput.equals("Y"));
        System.out.println("Please enter a numerical grade: ");
        int userInput = scanner.nextInt();
        String userConfirm;
        do {
            if (userInput < 59) {
                System.out.println("Sorry your grade is a F.");
            }
            else if ((60 >= userInput) || (userInput <= 66)) {
                System.out.println("Your grade is a D.");
            } else if ((67 >= userInput) || (userInput <= 79)) {
                System.out.println("Your grade is a C.");
            } else if ((80 >= userInput) || (userInput <= 87)) {
                System.out.println("Your grade is a B!");
            } else {
                System.out.println("Your grade is a A!");
            }
            System.out.println("Would you like to continue? (Y/N)");
            userConfirm = scanner.next();
            if (userConfirm.equals("Y")) {
                System.out.println("Please enter a new numerical grade: ");
                userInput = scanner.nextInt();
            }
        } while (userConfirm.equals("Y"));

    }
}

