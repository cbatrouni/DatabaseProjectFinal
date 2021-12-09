package com.company;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner input = new Scanner(System.in);
    static account accountClass = new account();
    static int listSize = accountClass.accountList.size();
    static Database dataTest = new Database();


    static public int beginScreen()
    {


        System.out.println("What would you like to do?");
        System.out.println("1) Login");
        System.out.println("2) Create Account");
        System.out.println("3) Close");

        int userInput = input.nextInt();

        return userInput;
    }


    public static void main(String[] args) {

        System.out.println("BEFORE:");
        dataTest.printDatabase();


        accountClass.userCreation(dataTest);

        System.out.println("AFTER CREATING USER");
        dataTest.printDatabase();

        dataTest.closeDatabase();

    }
}
