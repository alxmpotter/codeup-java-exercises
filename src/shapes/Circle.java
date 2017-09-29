package shapes;

public class Circle implements Measurable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
//       return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;

    }

    public double getPerimeter(){
        return 0;
    }
}
