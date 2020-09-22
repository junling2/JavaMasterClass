package com.yamcha;

public class LinkedListJQ implements NodeList{
    // has ListItems and can use functionality of NodeList
    private ListItem root = null;

    public LinkedListJQ(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // list is empty
            this.root = newItem;
            return true;
        }
        ListItem current = this.root;

        while (current != null) {
            int compare = current.compareTo(newItem);
            if (compare < 0) {
                // new item is greater, need to move right if possible
                if (current.next() != null) {
                    current = current.next();
                }
                else {
                    // reached end of list
                    current.setNext(newItem);
                    newItem.setPrevious(current);
                    return true;
                }
            }
            else if (compare > 0) {
                // new item is less than root, insert at head of list
                if (current.previous() != null) {
                    current.previous().setNext(newItem);
                    newItem.setPrevious(current.previous());
                    newItem.setNext(current);
                    current.setPrevious(newItem);
                }
                else {
                    // set new item as root.
                    newItem.setNext(this.root);
                    newItem.setPrevious(null);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else {
                // items are equal
                System.out.println(newItem.getValue() + " is already in list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Removing item " + item.getValue() + " from list");
        }
        ListItem iterator = this.root;

        while (iterator != null) {
            int compare = iterator.compareTo(item);
            if (compare == 0) {
                if (iterator == this.root) {
                    this.root = iterator.next();
                    this.root.setPrevious(null);
                }
                else {
                    // node that needs to be removed is not the root node
                    iterator.previous().setNext(iterator.next());
                    if (iterator.next() != null) {
                        iterator.next().setPrevious(iterator.previous());
                    }
                }
                return true;
            }
            else if (compare < 0) {
                iterator = iterator.next();
            }
            else {
                System.out.println("Item is not in the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next;
        }

    }
}
