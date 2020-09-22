package com.yamcha;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.next;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.next = item;
        return this.next;
    }

    @Override
    public ListItem previous() {
        return this.previous;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    // using built in compareTo() method from String
    public int compareTo(ListItem item) {
        String newValue = (String) item.getValue();
        String nodeValue = (String) this.value;
        if (item != null) {
            return nodeValue.compareTo(newValue);
        }
        else {
            return -1;
        }
    }
}
