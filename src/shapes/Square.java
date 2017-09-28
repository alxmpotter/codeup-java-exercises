package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }

    public double setLength(){
        return this.getLength();
    }

    public double setWidth(){
        return this.getWidth();
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }
}
