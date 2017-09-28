package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }

    //get width and length to use in a subclass
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}
