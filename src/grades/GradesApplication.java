package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Student jeremy = new Student("Jeremy");
        Student joe = new Student("Joe");
        Student dan = new Student("Dan");
        Student bob = new Student("Bob");

        jeremy.addGrade(100);
        jeremy.addGrade(90);
        jeremy.addGrade(95);

        dan.addGrade(85);
        dan.addGrade(100);
        dan.addGrade(90);

        joe.addGrade(80);
        joe.addGrade(70);
        joe.addGrade(75);

        bob.addGrade(60);
        bob.addGrade(50);
        bob.addGrade(50);

        HashMap<String, Student> students = new HashMap<>();

        students.put("Joe-Code", joe);
        students.put("JayTan", jeremy);
        students.put("Dan-Bug", dan);
        students.put("Bobber", bob);

        do {
        System.out.println(students);
        System.out.println("Which student would you like more information about?");
        String userInput = input.getString();
            if (userInput.equalsIgnoreCase("bobber")) {
                System.out.println("Name: " + bob.getName() + " GitHub Username: " + bob.getName());
                System.out.println("Current Average: " + bob.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("joe-code")) {
                System.out.println("Name: " + joe.getName() + " GitHub Username: " + joe.getName());
                System.out.println("Current Average: " + joe.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("jaytan")) {
                System.out.println("Name: " + jeremy.getName() + " GitHub Username: " + jeremy.getName());
                System.out.println("Current Average: " + jeremy.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("dan-bug")) {
                System.out.println("Name: " + dan.getName() + " GitHub Username: " + dan.getName());
                System.out.println("Current Average: " + dan.getGradeAverage());
            }
            else {
                System.out.println("User not found. Please select another user.");
            }

            System.out.println("Would you like to see another Student?");
        }while(input.yesNo());
    }
}
