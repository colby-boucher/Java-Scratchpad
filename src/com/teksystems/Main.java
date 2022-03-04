package com.teksystems;

public class Main {

    public static void main(String[] args) {
        /* Just un-comment the code for that particular assignment
         and run main /*

        ///////////////////////////////////////////////////////////////////////

        //Core Java - Exercises - Variables
	    /*
	    Variables.q1();
        Variables.q2();
        Variables.q3();
        Variables.q4();
        Variables.q5();
        Variables.q6();
        Variables.q7();
        Variables.q8();
        */

        ///////////////////////////////////////////////////////////////////////

        //Core Java - Exercises - Operators & Numbers
        //This is hideously stupid, I know
        /*
        //Q1
        //Trust me the output really is binary, but it's binary as a Deque of booleans
        //That way you can do some fun math with 'em, as opposed to if they were just
        //integers or strings masquerading as binary
        //Making it a Deque was probably dumb, but I know nothing about Java
        System.out.println("Question 1");
        System.out.println(OperatorsNumbers.toBinaryDeque(1));
        System.out.println(OperatorsNumbers.toBinaryDeque(8));
        System.out.println(OperatorsNumbers.toBinaryDeque(33));
        System.out.println(OperatorsNumbers.toBinaryDeque(78));
        System.out.println(OperatorsNumbers.toBinaryDeque(787));
        System.out.println(OperatorsNumbers.toBinaryDeque(33987L)); //Doesn't need to be long, just demonstrating

        //Q2
        System.out.println("\nQuestion 2");
        Deque<Boolean> binary = new ArrayDeque<>();
        binary.add(false); binary.add(false); binary.add(true); binary.add(false);
        System.out.println("0010 = "+ OperatorsNumbers.toDecimal(binary));
        binary.clear();
        binary.add(true); binary.add(false); binary.add(false); binary.add(true);
        System.out.println("1001 = "+ OperatorsNumbers.toDecimal(binary));
        binary.clear();
        binary.add(false); binary.add(false); binary.add(true); binary.add(true);
        binary.add(false); binary.add(true); binary.add(false); binary.add(false);
        System.out.println("00110100 = "+ OperatorsNumbers.toDecimal(binary));
        binary.clear();
        binary.add(false); binary.add(true); binary.add(true); binary.add(true);
        binary.add(false); binary.add(false); binary.add(true); binary.add(false);
        System.out.println("01110010 = "+ OperatorsNumbers.toDecimal(binary));
        binary.clear();
        binary.add(false); binary.add(false); binary.add(true); binary.add(false);
        binary.add(false); binary.add(false); binary.add(false); binary.add(true);
        binary.add(true); binary.add(true); binary.add(true); binary.add(true);
        System.out.println("001000011111 = "+ OperatorsNumbers.toDecimal(binary));
        binary.clear();
        binary.add(false); binary.add(false); binary.add(true); binary.add(false);
        binary.add(true); binary.add(true); binary.add(false); binary.add(false);
        binary.add(false); binary.add(true); binary.add(true); binary.add(false);
        binary.add(false); binary.add(true); binary.add(true); binary.add(true);
        System.out.println("0010110001100111 = "+ OperatorsNumbers.toDecimal(binary));

        //Q3
        System.out.println("\nQuestion 3");
        OperatorsNumbers.Q3();

        //Q4
        System.out.println("\nQuestion 4");
        OperatorsNumbers.Q4();

        //Q5
        System.out.println("\nQuestion 5");
        OperatorsNumbers.Q5();

        //Q6
        System.out.println("\nQuestion 6");
        OperatorsNumbers.Q6();

        //Q7
        System.out.println("\nQuestion 7");
        OperatorsNumbers.Q7();

        //Q8
        System.out.println("\nQuestion 8");
        OperatorsNumbers.Q8();

         */
        ///////////////////////////////////////////////////////////////////////////

        //Core Java - Exercise - Control Flow (Conditional) Statements
        /*
        System.out.println("Question 1");
        ControlFlow.Q1();
        System.out.println("\nQuestion 2");
        ControlFlow.Q2();
        System.out.println("\nQuestion 3, note that a value of 10 is missed entirely per the instructions");
        ControlFlow.Q3();
        System.out.println("\nQuestion 4");
        ControlFlow.Q4();
        System.out.println("\nQuestion 5");
        ControlFlow.Q5();
        System.out.println("\nQuestion 6");
        ControlFlow.Q6();
        */
        ///////////////////////////////////////////////////////////////////////
        //Core Java - Exercise - Arrays
        System.out.println("\nQuestion 1");
        MyArrays.Q1();
        System.out.println("\nQuestion 2");
        System.out.println(MyArrays.Q2()); //Question did say to RETURN the middle element after all
        System.out.println("\nQuestion 3");
        MyArrays.Q3();
        System.out.println("\nQuestion 4");
        MyArrays.Q4();
        System.out.println("\nQuestion 5");
        MyArrays.Q5();
        System.out.println("\nQuestion 6");
        MyArrays.Q6();
        System.out.println("\nQuestion 7");
        MyArrays.Q7();
        System.out.println("\nQuestion 8");
        MyArrays.Q8();
        System.out.println("\nQuestion 9");
        MyArrays.Q9();
        System.out.println("\nQuestion 10");
        MyArrays.Q10();
    }
}
