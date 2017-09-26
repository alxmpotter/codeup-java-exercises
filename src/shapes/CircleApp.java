package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input userInput = new Input();

        System.out.println("Enter radius.");

        Circle circle = new Circle(userInput.getDouble());

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
