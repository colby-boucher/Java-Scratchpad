package com.teksystems;

import java.util.Arrays;

public class MyArrays {
    static void Q1(){
        int[] array = {1,2,3};
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }

    static int Q2(){
        int[] x= {13,5,7,68,2};
        return x[(x.length/2)];
    }

    static void Q3(){
        String[] x= {"Red","Green","Blue","Yellow"};
        System.out.println(x.length);
        String[] y=x.clone(); //not gonna lie clone seems complicated
        System.out.println(Arrays.toString(y));
    }

    static void Q4(){
        int[]  x= {1,2,3,4,5};
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);
        try{
            System.out.println(x[x.length]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            x[5]= 12;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    static void Q5(){
        int[] x= {1,2,3,4,5};
        for (int i= 0; i< x.length; i++) {
            System.out.println(x[i]);
        }
    }

    static void Q6(){
        int[] x= {1,2,3,4,5};
        for (int i= 0; i< x.length; i++) {
            try {
                System.out.println(x[i * 2]);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    static void Q7(){
        int[] x= {1,2,3,4,5};
        for (int i= 0; i< x.length; i++) {
            if (i== 2){
                continue;
            }
            else {
                System.out.println(x[i]);
            }
        }
    }

    static void Q8(){
        String[] x= {"pizza","pasta","pie","peas","peanuts"};
        System.out.println(Arrays.toString(x));;
        String spot1= x[0];
        String spot2= x[2];
        x[0]= spot2;
        x[2]= spot1;
        System.out.println(Arrays.toString(x));
    }

    static void Q9(){
        int[] x= {4,2,9,13,1,0};
        Arrays.sort(x);
        System.out.print("Array in ascending order: "+Arrays.toString(x));

        System.out.println("\nThe smallest number is: "+ x[0]);
        System.out.println("The largest number is: "+ x[5]);
    }

    static void Q10(){
        Object[] arr= new Object[5];
        arr[0]= 8;
        arr[1]= "oof";
        arr[2]= "sus";
        arr[3]= "amogus";
        arr[4]= 3.75;

        System.out.println(Arrays.toString(arr));

    }
}
