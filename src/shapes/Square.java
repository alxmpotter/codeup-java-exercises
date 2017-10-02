package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side){
         this.width = side;
         this.length = side;
    }

    //can access with this.length, or getLength.
    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return getLength() * 4;
    }
}
