package util;

import java.util.Scanner;

public class Input {
    private Scanner inputScan = new Scanner(System.in);

    public String getString() {
        String userInput = inputScan.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        String userBool = inputScan.nextLine();
        if (userBool.equalsIgnoreCase("yes") || userBool.equalsIgnoreCase("y")) {
            return true;
        } else
            return false;
    }

    public int getInt(int min, int max) {
        System.out.format("Please enter a number between %d and %d.%n", min, max);
        int value = inputScan.nextInt();
        if ((value <= max) && (value >= min)) {
            return value;
        } else {
            System.out.println("Please enter a number within the range:");
//            value = scanner.nextInt();
            getInt(min, max);
        }
        return value;
    }

    public int getInt() {
        int userInt = inputScan.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        System.out.format("Please enter a decimal number between %d and %d.%n", min, max);
        double value = inputScan.nextDouble();
        if ((value <= max) && (value >= min)) {
            return value;
        } else {
            System.out.println("Please enter a number within the range:");
//            value = scanner.nextInt();
            getDouble(min, max);
        }
        return value;
    }

    public double getDouble() {
        double userDouble = inputScan.nextDouble();
        return userDouble;
    }


}
