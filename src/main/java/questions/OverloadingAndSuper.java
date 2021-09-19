package questions;

public class OverloadingAndSuper {

    public static class Quadrilateral {
        public double sideA,sideB,sideC,sideD;

        public Quadrilateral(double sideA,double sideB,double sideC,double sideD){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        }

        public double calculateArea(){
            return 0;
        }

    }

    public static class Rectangle extends Quadrilateral{

        public Rectangle(double length,double width){
            super(length,length,width,width);
        }

        @Override
        public double calculateArea() {
            return this.sideA * this.sideD;
        }

        public static double calculateArea(double length,double width){
            return length * width;
        }
    }

    public static class Square extends Quadrilateral{

        public Square(double side){
            super(side,side,side,side);
        }

        @Override
        public double calculateArea() {
            return Math.pow(this.sideA,2);
        }

        public static double calculateArea(double side) {
            return Math.pow(side,2);
        }
    }

    public static void main(String[] args) {
        //create a new instance of rectange and squre
        Rectangle rectangle = new Rectangle(10,5);
        Square square = new Square(4);

        // calculate area of rectangle and square previously made
        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());

        //use static methods in square and rectangle to calculate
        //area of any rectangle or square
        System.out.println(Square.calculateArea(5));
        System.out.println(Rectangle.calculateArea(12,9));
    }


}


