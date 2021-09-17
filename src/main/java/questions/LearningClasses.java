package questions;

public class LearningClasses {
    /*
Create a Rectangle class
Give it to properties..- width and length
Create a method to calculate the area of the rectangle

//Go inside main
 - create one rectangle object
 - set the width and length
 - invoke or call the rectangle method

 */
    public static abstract class Shapes{
        public double area;

        public abstract double calculateArea();

        public abstract double calculatePerimeter();
    }
//
//    public static class Rectangle extends Shapes{
//        public double length;
//
//        public double width;
//
//        public Rectangle(double length,double width){
//            this.length = length;
//            this.width = width;
//        }
//
//        @Override
//        public double calculateArea(){
//            return this.length * this.width;
//        }
//
//        @Override
//        public double calculatePerimeter() {
//            //Calculate perimeter
//             return 2*(this.length*this.width);
//        }
//    }
//
//    public static class Circle extends Shapes{
//        public double radius;
//
//        public Circle(double radius){
//            this.radius = radius;
//        }
//
//        @Override
//        public double calculateArea() {
//            double pi = 3.14;
//            return pi*(Math.pow(this.radius,2));
//        }
//
//        @Override
//        public double calculatePerimeter() {
//            double pi = 3.14;
//            return 2*pi*this.radius;
//        }
//
//        public double calculateCircumference(){
//            return calculatePerimeter();
//        }
//    }
//
//    public static class Song{
//        public String title;
//        public String artist;
//
//        public Song(String title,String artist){
//            this.title = title;
//            this.artist = artist;
//        }
//
//        public void editTitle(String newTitle){
//            this.title = newTitle;
//        }
//        public void editArtist(String newArtist){
//            this.artist = newArtist;
//        }
//    }

    public static class Triangle extends Shapes{
        public double base;
        public double height;

        public double sideA;
        public double sideB;
        public double sideC;

        public Triangle(double base,double height,double sideA,double sideB,double sideC){
            this.base = base;
            this.height = height;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public double calculateArea(){
            return .5*this.base*this.height;
        }

        @Override
        public double calculatePerimeter() {
            //Calculate perimeter
            return sideA+sideB+sideC;
        }
    }
    public static class Square extends Shapes{
        public double length;


        public Square(double length){
            this.length = length;
        }

        @Override
        public double calculateArea(){
            return Math.pow(this.length,2);
        }

        @Override
        public double calculatePerimeter() {
            //Calculate perimeter
            return 2*this.length;
        }
    }

    public static class Dog{
        public int legs = 4;

        public String typeOfDog;
        public boolean safeToPet;

        public Dog(String typeOfDog,boolean safeToPet){
            this.typeOfDog = typeOfDog;
            this.safeToPet = safeToPet;
        }

        public void bark(){
            System.out.println("Woof");
        }

        public void tryToPet(){
            if(this.safeToPet){
                System.out.println("cute wiggles");
            }else{
                System.out.println("Big Ass Bite");
            }
        }

    }
    public static class Cat{
        public int legs = 4;

        public String typeOfCat;
        public boolean safeToPet;

        public Cat(String typeOfCat,boolean safeToPet){
            this.typeOfCat = typeOfCat;
            this.safeToPet = safeToPet;
        }

        public void meow(){
            System.out.println("Meowww");
        }

        public void tryToPet(){
            if(this.safeToPet){
                System.out.println("-__-");
            }else{
                System.out.println("Scratches");
            }
        }

    }
    public static class Calculator{
        public double add(double firstVal,double secondVal){
            return firstVal+secondVal;
        }
        public double subtract(double firstVal,double secondVal){
            return firstVal-secondVal;
        }
        public double divide(double firstVal,double secondVal){
            return firstVal/secondVal;
        }
        public double multiply(double firstVal,double secondVal){
            return firstVal*secondVal;
        }
        public double exponent(double firstVal,double secondVal){
            return Math.pow(firstVal, secondVal);
        }
    }

    public static class Employee{
        public double hoursWorked;
        public double hourlyRate;

        public Employee(double hourlyrate,double hoursworked){
            this.hourlyRate = hourlyrate;
            this.hoursWorked = hoursworked;
        }
        public double calculatePay(){
            return hourlyRate*hoursWorked;
        }
    }

    /*
        Question 1
        Create the following shapes...Make sure you have methods to calculate the area and perimeter of each shape
        Square Triangle
        Question 2
        Create 2 different animal classes and create an object from each one, Also give them methods... make it your own!
        Question 3
        Create a class called Calculator - it should have the following methods to do some calculations:
        Method to add
        Method to subtract
        Method to divide
        Method to multiply
        Method to calculate exponents
        In main..create a Calculator object and invoke the methods
        Question 4
        Create an Employee Class and give it a hoursWorked and hourlyPay
        Then create a method to calculate each employee's pay
        In main  - create 2 employee objects and use the method to calculate their pay
*/

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5.4,5.9);
//        System.out.println(rectangle.calculateArea());
//        System.out.println(rectangle.calculatePerimeter());
//        Circle circle = new Circle(5.5);
//        System.out.println(circle.calculateArea());
//        System.out.println(circle.calculatePerimeter());
//        System.out.println(circle.calculateCircumference());

        Dog spike = new Dog("rotweiler",false);
        spike.bark();
        spike.tryToPet();

        Cat missy = new Cat("caleco",true);
        missy.meow();
        missy.tryToPet();

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,1));
        System.out.println(calculator.subtract(1,1));
        System.out.println(calculator.multiply(1,1));
        System.out.println(calculator.divide(10,5));
        System.out.println(calculator.exponent(2,2));

        Employee joe = new Employee(11,40);
        System.out.println(joe.calculatePay());

        Employee laquisha = new Employee(15,45);
        System.out.println(laquisha.calculatePay());

    }
}
