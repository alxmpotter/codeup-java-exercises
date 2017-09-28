package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
        private double length;
        private double width;

        public Quadrilateral(double length, double width){
            this.length = length;
            this.width = width;
        }

        public double getLength(){
            return this.length;
        }

        public double getWidth(){
            return this.width;
        }

        abstract public double setLength();

        abstract public double setWidth();
}
