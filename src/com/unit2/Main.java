package com.unit2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do{
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("Enter the item: ");
                    String item = sc.next();
                    list.add(item);
                    System.out.println("Item added");
                    break;
                case 2:
                    System.out.println("Enter the item you want to search");
                    String item1 = sc.next();
                    search(item1, list);
                    break;
                case 3:
                    System.out.println("Enter the item you want to delete");
                    String item2 = sc.next();
                    list.remove(item2);
                    System.out.println("Item is removed");
                    break;
                case 4:
                    display(list);
                    break;
                case 5:
                    break;
            }


        } while(choice != 5);

    }
//    2692
    public static void display(java.util.ArrayList<String> list){

        if(list.size() == 0){
            System.out.println("List is empty");
        }
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String i = itr.next();
            System.out.print(i + " ");

        }
        System.out.println();
//        for(String i: list){
//            System.out.print(i  + ", ");
//        }
//        System.out.println();
    }

    public static void search(String item, java.util.ArrayList<String> list){
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(item) == 0){
                System.out.println("This item is at index " + i);
                return;
            }
            counter++;
        }

        if(counter == list.size()){
            System.out.println("There's no such item in the list");
        }
    }

// ironman   hello   laptop


}
