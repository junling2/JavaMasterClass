package com.yamcha;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact #" + (i + 1) + ": " + contacts.get(i).getName());
            System.out.println("Contact #" + (i + 1) + " Phone Number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public String addContact(String name, String phoneNumber) {
        if (findContact(name)) {
            return "Contact already exists, failed to add contact";
        }
        else {
            Contacts newContact = new Contacts(name, phoneNumber);
            contacts.add(newContact);
            return "Contact added successfully";
        }
    }

    public String removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                Contacts removed = new Contacts(name,contacts.get(i).getPhoneNumber());
                contacts.remove(removed);
                return "Contact removed";
            }
        }
        return "Contact not in list, failed to remove";
    }

    public boolean findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String updateContact(String name, String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.get(i).setPhoneNumber(phoneNumber);
                return "Contact updated";
            }
        }
        return "Contact was not found";
    }
}
