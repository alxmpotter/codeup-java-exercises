package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5, 4);
        Square box2 = new Square(5);

        System.out.println("The area is " + box1.getArea());
        System.out.println("The perimeter is " + box1.getPerimeter());

        System.out.println("The area of the square is " + box2.getArea());

        System.out.println("The perimeter of a square is " + box2.getPerimeter());

    }
}
