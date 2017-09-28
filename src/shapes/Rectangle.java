package shapes;

class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double l, double w){
        super(l, w);

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
