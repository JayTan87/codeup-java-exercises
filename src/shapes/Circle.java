package shapes;

public class Circle {
    private double radius;

    public Circle(){
        radius = 5.00;
    }

    public Circle(double num) {
        radius = num;
    }

    public double getArea() {
    double area = (Math.PI *(Math.pow(this.radius, 2.0)));
    return area;
    }

    public double getCircumference(){
    double circumference = (2 * Math.PI * this.radius);
    return circumference;
    }
}
