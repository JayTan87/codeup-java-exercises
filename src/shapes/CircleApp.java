package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble("Enter a decimal number for the radius");
            Circle mycircle = new Circle(radius);

            System.out.printf("The area of your circle is %.2f and the circumference is %.2f.%n", mycircle.getArea(), mycircle.getCircumference());
        }while(input.yesNo("Would you like to create another circle?"));
    }
}
