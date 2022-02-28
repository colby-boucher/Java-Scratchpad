package com.teksystems;

public class Variables {
    static void q1() {
        int numberOne= 1;
        int numberTwo= 2;
        int numberThree= numberOne+numberTwo;
        System.out.println("Q1: "+numberThree);
    }
    static void q2(){
        double numberOne= 1.3;
        double numberTwo= 4.8;
        double numberThree= numberOne+numberTwo;
        System.out.println("Q2: "+numberThree);
    }
    static void q3(){
        int numberOne= 5;
        double numberTwo= 2.4;
        double numberThree= numberOne+numberTwo;
        System.out.println(
                "Q3: Must be saved as double to not lose data. " + numberThree);
    }
    static void q4(){
        int numberOne= 3;
        int numberTwo= 6;
        int numberThree= numberOne/numberTwo;
        System.out.println("Q4, before type conversion: "+numberThree);
        double numberFour= numberThree;
        System.out.println("Q4, after type conversion: "+numberFour);
    }
    static void q5(){
        double numberOne= 2.7;
        double numberTwo= 3.8;
        double numberThree= numberTwo/numberOne;
        System.out.println("Q5, before type conversion: "+numberThree);
        int numberFour= (int)numberThree;
        System.out.println("Q5, after type conversion: "+numberFour);
    }
    static void q6(){
        int x= 5;
        int y= 6;
        double q= y/x;
        System.out.println("Q6, before type conversion: "+q);
        q= y;
        System.out.println("Q6, after type conversion "+q);
    }
    static void q7(){
        final double pi= 3.14159;
        double circumference= 12;
        double radius= circumference/(2*pi);
        System.out.println("Q7: "+radius);
    }
    static void q8(){
        double coffeePrice= 4.99;
        double muffinPrice= 2.99;
        double teaPrice= 3.99;
        double subtotal;
        double totalSale;
        final double SALES_TAX= 0.10;

        subtotal = (coffeePrice*3) + (muffinPrice*4) + (teaPrice*2);
        totalSale = subtotal + (subtotal*SALES_TAX);
        System.out.println("Q8: "+String.format("%.2f",totalSale));
    }
}
