package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(8, 20);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Square(8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


        Rectangle myRectangle = new Rectangle(9,11);
        System.out.println(myRectangle.getLength());

    }
}
