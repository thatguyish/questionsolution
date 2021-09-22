package questions;

import java.util.Scanner;

public class Answer {
//    public static boolean contains(String[] names, String element){
//        //loop through string array
//        //check if person is in line
//        //return true if person is there
//        return false;
//    }
//
//    public static int getIndexByElement(String[] names,String element){
//        //names = {"taco","john","joey"};
//        //check for name
//        //returning index for element
//
//        return 0;
//    }
//    public static double calculateTotalBill(double[] bill){
//        //1.5,1.9,2.8,5.7
//        //  0, 1, 2, 3
//        double currentTotal = 0;
//        for(int i =0;i<bill.length;i++){
//            currentTotal= currentTotal+bill[i];
//        }
//        return currentTotal;
//    }
//
//    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
//        //are we returning the amount of fib numbers up to the max number or
//        //are we trying to get to the max number using the fib sequece?
//
//        return null;
//    }
//
//    public class square {
//        public void main(String[] args){
//            Scanner scanner = new Scanner(System.in);
//
//            int side = 0;
//            int area = 0;
//            int perimeter = 0;
//
//            System.out.println("Enter the length of side of a Square");
//            side = scanner.nextInt();
//
//            area = side * side;
//            perimeter = 4 * side;
//
//            System.out.println("The area of the square is: " + area);
//            System.out.println("The perimeter of the square is: " + perimeter);
//        }
//    }

    public static class Bank{
        private double balance;

        public void setBalance(double val){
            if (val<=0){
                this.balance = 0;
            }
            else {
                this.balance = val;
            }
        }

    }

    public static void main(String[] args) {
//        double[] numbers = {1.5,1.9,2.8,5.7};
//        calculateTotalBill(numbers);
        Bank bank = new Bank();
//        System.out.println(bank.setBalance(1000));


    }
}
