package com.teksystems;

import java.util.Scanner;

public class ControlFlow {
    static void Q1(){
        int x= 7;
        if(x<10){
            System.out.println("Less than 10");
        }
        x= 15;
        if(x<10){
            System.out.println("Less than 10");
        }
    }

    static void Q2(){
        int x= 7;
        if(x<10){
            System.out.println("Less than 10");
        }
        else{
            System.out.println("Greater than 10");
        }

        x= 17;
        if(x<10){
            System.out.println("Less than 10");
        }
        else{
            System.out.println("Greater than 10");
        }
    }

    static void Q3(){
        int x= 15;
        if(x<10){
            System.out.println("Less than 10");
        }
        else if(x<20 && x>10){
            System.out.println("Between 10 and 20");
        }
        else{
            System.out.println("Greater than or equal to 20");
        }

        x= 50;
        if(x<10){
            System.out.println("Less than 10");
        }
        else if(x<20 && x>10){
            System.out.println("Between 10 and 20");
        }
        else{
            System.out.println("Greater than or equal to 20");
        }
    }

    static void Q4(){
        int x= 15;
        if(x<10 || x>20){
            System.out.println("Out of range");
        }
        else{
            System.out.println("In range");
        }

        x= 5;
        if(x<10 || x>20){
            System.out.println("Out of range");
        }
        else{
            System.out.println("In range");
        }
    }

    static void Q5(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give us a grade:");
        int grade= sc.nextInt();

        if(grade > 100){
            System.out.println("Out of range");
        }
        else if(grade >= 90){
            System.out.println("You got an A!");
        }
        else if(grade >= 80){
            System.out.println("You got an B!");
        }
        else if(grade >= 70){
            System.out.println("You got an C!");
        }
        else if(grade >= 60){
            System.out.println("You got an D!");
        }
        else if(grade < 60 && grade > 0){
            System.out.println("You got an F!");
        }
        else{
            System.out.println("Out of range");
        }
    }

    static void Q6(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give us a number:");
        int day= sc.nextInt();

        if(day== 1){
            System.out.println("It's Sunday!");
        }
        else if(day==2){
            System.out.println("It's Monday!");
        }
        else if(day==3){
            System.out.println("It's Tuesday!");
        }
        else if(day==4){
            System.out.println("It's Wednesday!");
        }
        else if(day==5){
            System.out.println("It's Thursday!");
        }
        else if(day==6){
            System.out.println("It's Friday!");
        }
        else if(day==7){
            System.out.println("It's Saturday!");
        }
        else{
            System.out.println("Out of range");
        }
    }
}
