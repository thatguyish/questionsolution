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

        //method being inherited by square and rectangle
        public double calculateArea(){
            return 0;
        }

    }

    public static class Rectangle extends Quadrilateral{

        public Rectangle(double length,double width){
            super(length,length,width,width);
        }

        //overrides method inherited by super class
        @Override
        public double calculateArea() {
            return this.sideA * this.sideD;
        }

        //overloads previous method adding additional functionality based on parameters
        public static double calculateArea(double length,double width){
            return length * width;
        }

        //overloads method this time accepting String as a parameter
        public double calculateArea(String length,String width){
            double widthAsDouble = Double.parseDouble(length);
            double lengthAsDouble = Double.parseDouble(width);
            return  widthAsDouble * lengthAsDouble;
        }
    }

    public static class Square extends Quadrilateral{

        public Square(double side){
            super(side,side,side,side);
        }

        //overrides method inherited by super class
        //then calls method using super keyword
        @Override
        public double calculateArea() {
            return super.calculateArea() + Math.pow(this.sideA,2);
        }

        //overloads previous method adding additional functionality based on parameters
        public static double calculateArea(double side) {
            return Math.pow(side,2);
        }
    }

    public static void main(String[] args) {
        //create a new instance of rectangle and square
        Rectangle rectangleB = new Rectangle(10,5);
        Square squareA = new Square(4);

        // calculate area of rectangle and square previously made
        System.out.println(rectangleB.calculateArea());
        System.out.println(squareA.calculateArea());

        //use static methods in square and rectangle to calculate
        //area of any rectangle or square
        System.out.println(Square.calculateArea(5));
        System.out.println(Rectangle.calculateArea(12,9));
        System.out.println(rectangleB.calculateArea("10","5"));
    }


}


