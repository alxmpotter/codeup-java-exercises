package shapes;

public class Square extends Rectangle {
    public Square(double side){
        super(side, side);
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    //use the getter to apply width from rectangle class to override method in square class
    public double getPerimeter(){
        return this.getWidth() * 4;
    }

}
