package com.teksystems;

import java.util.Locale;
import java.util.Scanner;

public class AdultUser implements ILibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType){
        this.age= age;
        this.bookType= bookType.toLowerCase(Locale.ROOT);
    }

    @Override
    public void registerAccount() {
        if(age<12){
            System.out.println("Sorry, age must be above 12 to register as an adult.");
        }
        else{
            System.out.println("You have successfully registered under a adult account");
        }
    }

    @Override
    public void requestBook() {
        if(bookType.equals("fiction")){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }
        else{
            System.out.println("Oops, you are only allowed to take adult Fiction books!");
        }
    }
}
