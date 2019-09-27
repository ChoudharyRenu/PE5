package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProblemOne {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> myList = new ArrayList<>();
    public void addAndDeleteElements(){
        String choice,WantToContinue;

        do {
            System.out.println("Make a choice:");
            System.out.println("1. add item");
            System.out.println("2. update item");
            System.out.println("3. empty list");
            choice = sc.next();
            if (choice.equals("1")) {
                addItem();
            } else if (choice.equals("2")) {
                updateItem();
            } else if (choice.equals("3")) {
                emptyList();
            }
            System.out.println("Do you want to continue:");
            WantToContinue = sc.next();
        }while (WantToContinue.equals("yes"));
    }
    public void emptyList(){
        if(myList.isEmpty()==false){
            myList.clear();
        }
    }

    public void updateItem(){
        String OldVal,NewVal;
        System.out.println("enter the item value you want to update:");
        OldVal = sc.next();
        System.out.println("enter the new value of the item:");
        NewVal = sc.next();
        int i = myList.indexOf(OldVal);
        myList.set(i,NewVal);

    }

    public void addItem(){
        String addThis;
        System.out.println("Enter the String item to add:");
        addThis = sc.next();
        myList.add(addThis);

    }
    public static void main(String[] args){
        ProblemOne obj = new ProblemOne();
        obj.addAndDeleteElements();
    }
}
