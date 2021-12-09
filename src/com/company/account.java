package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class account {

    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    static Scanner input = new Scanner(System.in);

    public ArrayList<account> accountList = new ArrayList<account>();


    public account(String userN, String passW, String firstN, String lastN)
    {
        userName = userN;
        passWord = passW;
        firstName = firstN;
        lastName = lastN;
    }

    public account()
    {

    }


    public void userCreation(Database dataTest)
    {
        System.out.println("Enter in a username:");
        String userInput = input.next();
        userName = userInput;

        System.out.println("Enter in a password:");
        userInput = input.next();
        passWord = userInput;

        System.out.println("Enter your firstname:");
        userInput = input.next();
        firstName = userInput;

        System.out.println("Enter your lastname:");
        userInput = input.next();
        lastName = userInput;
        //String[] inputArray = userInput.split(" ");
        //account userAccount = new account(userName, passWord, firstName, lastName);

        //accountList.add(userAccount);

        dataTest.addUser(userName, passWord, firstName, lastName);
    }

    public void setUserName(String userN)
    {
        userName = userN;
    }

    public void setPassWord(String passW)
    {
        passWord = passW;
    }

    public void setFirstName(String firstN)
    {
        firstName = firstN;
    }

    public void setLastName(String lastN)
    {
        lastName = lastN;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassWord()
    {
        return passWord;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}
