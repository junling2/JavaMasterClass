package com.yamcha;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ITelephone myphone; // note by assigning as interface, myphone object can be assigned to different classes
//                                // based on interface, i.e MobilePhone. instead of being restricted to 1 class
//        myphone = new DeskPhone(9163293);
//        myphone.p0werOn();
//        myphone.callPhone(9163293);
//        myphone.answer();

        Player Goku = new Player("Kakarot", 100, 69);
        Goku.setStrength(9001);
        saveObject(Goku);
        System.out.println(Goku);

        Player Vegeta = new Player("default", 0, 0);
        loadObject(Vegeta);
        System.out.println(Vegeta);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Choose\n" +
                "1 to enter string\n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String input = scanner.nextLine();
                    values.add(input);
                    break;
            }
        }
        return values;
    }
    // saving current fields to an ArrayList
    public static void saveObject(ISaveable objectToSave) { // generic way to allow any class that implements this interface to be passed
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to save file.");
        }
    }

    // defining object fields by loading from an ArrayList
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

// important distinction between inheritance, composition, and interfaces: as discussed in previous lectures, can think of inheritance as "is a"
// relationship and composition as a "has a" relationship. interfaces can be used as a "able to" relationship
// example: a dog class and a bird class both inherit from animal class, use interfaces to define walk and fly methods
// a dog is a animal & able to walk. a bird is a animal and able to fly and able to walk. dog class would "extends" animal and "implements" IWalk
// bird would "extends" animal, "implements" IWalk, "implements" IFly