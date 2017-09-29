package shapes;

class Rectangle extends Quadrilateral {

    public Rectangle(double l, double w){
        super(l, w);

    }

    public void setLength(double side){
         this.length = side;
    }

    public void setWidth(double side){
         this.width = side;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return getLength() * 2 + getWidth() * 2;
    }

}
