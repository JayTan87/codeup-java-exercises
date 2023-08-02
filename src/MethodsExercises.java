import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return sum;
    }

    public static int subtraction(int numOne, int numTwo) {
        int result = numOne - numTwo;
        return result;
    }

    public static int multiplication(int numOne, int numTwo) {
        int answer = numOne + numTwo;
        return answer;
    }

    public static double division(double numOne, double numTwo) {
        double total = numOne / numTwo;
        return total;
    }

    public static double modulus(double numOne, double numTwo) {
        double remain = numOne / numTwo;
        return remain;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Please enter a number between %d and %d.%n", min, max);
        int value = scanner.nextInt();
        if ((value <= max) && (value >= min)) {
            return value;
        } else {
            System.out.println("Please enter a number within the range:");
//            value = scanner.nextInt();
            getInteger(min, max);
        }
        return value;
    }

    public static void factorial() {
//        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to see its factorial");
        int userInput = scanner.nextInt();
        int count = 1;
        String equals = " = ";
        String multi = "";
        String operator = " x ";
        String sentence = "! = ";

        for (int i = 1; i <= userInput; i++) {
            count = count * i;
            for (int num = i; num <= i; num++) {
                if(multi.equals("")){
                    multi += num;
                }
                else
                multi += operator + num;
            }
            System.out.printf("%s %s %-20s %s %d%n", i, sentence, multi, equals, count);
            }
////
        }

////
////        while();
//    }

    public static void main(String[] args) {
        System.out.println(addition(4, 5));
        System.out.println(subtraction(4, 5));
        System.out.println(multiplication(4, 5));
        System.out.println(division(4, 5));
        System.out.println(modulus(4, 5));
//        getInteger(1, 10);
        factorial();
    }
}

