package com.yamcha;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone iphone = new MobilePhone();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;

        while(!quit) {
            printOptions();
            System.out.println("Select Menu Option: ");
            int option = s.nextInt();

            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printOptions();
                    break;
                case 2:
                    iphone.printContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    updateContact();
                    break;
                case 6:
                    searchContact();
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Option 0: Quit");
        System.out.println("Option 1: Print Menu Options");
        System.out.println("Option 2: Print List of Contacts");
        System.out.println("Option 3: Add Contact");
        System.out.println("Option 4: Remove Contact");
        System.out.println("Option 5: Update Contact");
        System.out.println("Option 6: Search Contact");
    }

    public static void addContact() {
        System.out.println("Enter Name: ");
        s.nextLine();
        String name = s.nextLine();
        System.out.println("Enter Phone number in the form of xxx-xxx-xxxx: ");
        String phoneNumber = s.nextLine();
        System.out.println(iphone.addContact(name, phoneNumber));
    }

    public static void removeContact() {
        System.out.println("Enter Contact Name to be removed: ");
        s.nextLine();
        String name = s.nextLine();
        System.out.println(iphone.removeContact(name));
    }

    public static void searchContact() {
        System.out.println("Enter Name: ");
        s.nextLine();
        String name = s.nextLine();
        if (iphone.findContact(name)) {
            System.out.println("Contact in directory");
        }
        else {
            System.out.println("Contact not found");
        }
    }

    public static void updateContact() {
        System.out.println("Enter Contact Name you wish to update: ");
        s.nextLine();
        String name = s.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = s.nextLine();
        System.out.println(iphone.updateContact(name, phoneNumber));
    }

}
