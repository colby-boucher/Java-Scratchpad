package com.teksystems;

import java.util.Locale;
import java.util.Scanner;

public class KidUser implements ILibraryUser {
    private int age;
    public String bookType;

    public KidUser(int age, String bookType){
        this.age= age;
        this.bookType= bookType.toLowerCase(Locale.ROOT);
    }

    @Override
    public void registerAccount() {
        if(age>12){
            System.out.println("Sorry, age must be over 12 to register as a kid");
        }
        else{
            System.out.println("You have successfully registered under a Kids Account");
        }
    }

    @Override
    public void requestBook() {
        if(bookType.equals("kids")){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }
        else{
            System.out.println("Oops, you are only allowed to take kids' books!");
        }
    }
}
