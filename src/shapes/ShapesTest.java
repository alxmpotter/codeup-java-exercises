package shapes;

public class ShapesTest {
    public static void main(String[] args){

        Measurable myShape = new Square(5);
            System.out.println("Square area: " + myShape.getPerimeter());
            System.out.println("Square perimeter: " + myShape.getArea());

        myShape = new Rectangle(5,3);
            System.out.println("Rectangle area: " + myShape.getArea());
            System.out.println("Rectangle perimeter: " + myShape.getPerimeter());


    }


}
