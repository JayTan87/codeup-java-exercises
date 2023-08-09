package shapes;

public class Square extends Quadrilateral{


   public Square(int side) {
      super(side, side);
   }


   @Override
   public double getPerimeter() {
      return (4 * this.length);
   }

   @Override
   public double getArea() {
      return Math.pow(this.length, 2);
   }

   @Override
   public void setLength(int side) {
      this.length = side;
      this.width = side;
   }

   @Override
   public void setWidth(int side) {
      this.length = side;
      this.width = side;

   }
}
