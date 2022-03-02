package com.teksystems;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class OperatorsNumbers {

    /*Would just like to point out that these questions specify "without Java functions",
    which puts them well beyond the ability of people who were only going off of the provided slides so far
    Feels like they were developed for a different curriculum or by someone who wasn't paying much attention*/

    /**
     * Converts the provided decimal number to binary.
     * Java sees the return value as a deque of booleans,
     * seemed better than integers masquerading as binary.
     * Besides, toBinaryString is already a thing.
     *
     * @param  decimal An integral, decimal number to be converted. Takes int or long.
     * @return         The provided decimal number as a boolean deque.
     */
    static Deque<Boolean> toBinaryDeque(Long decimal){
        long workingDecimal= decimal;
        Deque<Boolean> convertedNum= new ArrayDeque<>();

        while (workingDecimal> 0) {
            boolean currentBit = 1 == (workingDecimal % 2); // True if the modulo is equal to 1 (corresponding to a binary 1, False otherwise (binary 0)
            convertedNum.addFirst(currentBit);
            workingDecimal = workingDecimal / 2;
        }//Why must these be objects goddamnit
        return convertedNum;
    }

    /**
     * Converts the provided decimal number to binary.
     * Java sees the return value as a deque of booleans,
     * seemed better than integers masquerading as binary.
     * Besides, toBinaryString is already a thing.
     *
     * @param  decimal An integral, decimal number to be converted. Takes int or long.
     * @return         The provided decimal number as a boolean deque.
     */
    static Deque<Boolean> toBinaryDeque(int decimal){
        long workingDecimal= decimal;
        Deque<Boolean> convertedNum= new ArrayDeque<>();

        while (workingDecimal> 0) {
            boolean currentBit= 1== (workingDecimal% 2); // True if the modulo is equal to 1 (corresponding to a binary 1, False otherwise (binary 0)
            convertedNum.addFirst(currentBit);
            workingDecimal= workingDecimal/ 2;
        }
        return convertedNum;  //I really wish this was a plain array but oh well
    }

    /** Converts the provided binary deque to decimal.
     *
     * @param binary A binary number represented as a Deque of booleans
     * @return convertedNum The decimal equivalent of your binary number, provided as a long
     */
    static long toDecimal(Deque<Boolean> binary){
        long convertedNum= 0;
        long placeValue= 1;
        Iterator<Boolean> i= binary.descendingIterator();
        while (i.hasNext()) {
            if (i.next()){
                convertedNum= convertedNum+ placeValue;
            }
            placeValue= placeValue* 2;
            i.remove();
        }
        return convertedNum;
    }

    static void Q3(){
        int x= 2, y= 9, z= 17, a= 88;
        x= x<< 1;
        String xBin= Integer.toBinaryString(x);
        System.out.println(
                "(Comes out to 4, right?) Real answer: "+ x+ "\nIn binary: "+ xBin
        );
        y= y<< 1;
        String yBin= Integer.toBinaryString(y);
        System.out.println(
                "(Comes out to 18, right? Actually do these always double?) Real answer: "+ y+ "\nIn binary: "+ yBin
        );
        z= z<< 1;
        String zBin= Integer.toBinaryString(z);
        System.out.println(
                "(Comes out to 34?) Real answer: "+ z+ "\nIn binary: "+ zBin
        );
        a= a<< 1;
        String aBin= Integer.toBinaryString(a);
        System.out.println(
                "(Wait, of course it doubles. Wild guess, 176.) Real answer: "+ a+ "\nIn binary: "+ aBin
        );
    }

    static void Q4(){
        int x= 150, y= 255, z= 1555, a= 32456;
        x= x>> 2;
        String xBin= Integer.toBinaryString(x);
        System.out.println(
                "(Should be 1/4th as large, 37) Real answer: "+ x+ "\nIn binary: "+ xBin
        );
        y= y>> 2;
        String yBin= Integer.toBinaryString(y);
        System.out.println(
                "(56) Real answer: "+ y+ "\nIn binary: "+ yBin
        );
        z= z>> 2;
        String zBin= Integer.toBinaryString(z);
        System.out.println(
                "(388) Real answer: "+ z+ "\nIn binary: "+ zBin
        );
        a= a>> 2;
        String aBin= Integer.toBinaryString(a);
        System.out.println(
                "(8,114) Real answer: "+ a+ "\nIn binary: "+ aBin
        );
    }

    static void Q5(){
        int x= 7, y=17;
        int z= x&y;
        System.out.println(
          "The result of bitwise 7&17 will be 1. Real answer: "+
                  (z)+ "\nIn binary: "+ Integer.toBinaryString(z)
        );
        int a= x|y;
        System.out.println(
                "The result of bitwise 7|17 will be 23. Real answer: "+
                        (a)+ "\nIn binary: "+ Integer.toBinaryString(a)
        );
    }

    static void Q6(){
      int x= 5;
      System.out.println("Before postfix operator: "+ x++);
      System.out.println("After postfix operator: "+ x);
    }

    static void Q7(){
        int x=5;
        System.out.println("Postfix increment "+ x++);
        System.out.println("Postfix increment two "+ x++);
        System.out.println("Prefix increment "+ ++x);
        System.out.println("prefix increment two "+ ++x);
        x= x+ 1;
        System.out.println("Manually reassigned increment: "+ x);
        x= x+ 1;
        System.out.println("Manually reassigned increment two: "+ x);
    }

    static void Q8(){
        int x= 5, y= 8;
        int sum= ++x + y;
        System.out.println("Prefix math result: "+ sum);
        x= 5;
        sum= x++ + y;
        System.out.println("Postfix math result: "+ sum);
    }
}
