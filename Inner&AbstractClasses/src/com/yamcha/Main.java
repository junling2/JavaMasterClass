package com.yamcha;

public class Main {

    public static void main(String[] args) {
        // Inner class = non static
        // need to reference outer object when creating inner class
        // best practice to make inner class private and access all functionality through gearbox.

        // 2 special cases of inner classes: local classes & anonymous classes.
        // local classes: create class within main method or other method.
        // anonymous classes: used only once.

        Gearbox mercedes = new Gearbox(8);

        mercedes.addGear(1, 12.3);
        mercedes.addGear(2, 15.4);
        mercedes.addGear(3, 18.6);

        mercedes.operateClutch(true);
        mercedes.changeGear(1);
        mercedes.changeGear(2);
        mercedes.operateClutch(false);
        System.out.println(mercedes.wheelSpeed(3000));


        // Abstract Classes
        // again need to be certain of relationship: "is a", "has a", "can"
        LinkedListJQ list = new LinkedListJQ(null);
        list.traverse(list.getRoot());

        String cities = "Edmonton Calgary Toronto Vancouver Winnipeg Ottawa";

        String[] data = cities.split(" ");

        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
