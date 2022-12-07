package pl.waw.great.collections;

import javax.naming.NameNotFoundException;

public class MyLinkedList implements MyList {

    private Element head;
    private String[] el;
    private String[] last;

    @Override
    public boolean add(String value) {
        if (this.head == null) {
            this.head = new Element(null, new Element(value, null));
            return true;
        }
        Element last = this.head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(new Element(value, null));
        return false;
    }

    @Override
    public String get(int index) {
        if (index >= this.size()) {
            return null;
            //throw new IndexOutOfBoundsException("Given index is not definied yet!");
        }
        int counter = 0;
        Element el = this.head;

        while (index != counter) {
            el = el.getNext();
            counter++;
        }

        return el.getNext().getValue();
    }

    @Override
    public String set(int index, String element) {
        if (index > this.size() - 1) {
            throw new IndexOutOfBoundsException("Given index is not definied yet!");
        }
        int counter = 0;
        Element el = this.head;
        while (index != counter) {
            el = el.getNext();
            counter++;
        }
        if (this.head == null) {
            this.head = new Element(element, null);
            return el.getValue();
        } else {
            el.setNext(new Element(element, el.getNext().getNext()));
            return el.getNext().getValue();
        }
    }

    @Override
    public String remove(int index) {
        if (index > this.size()) {
            throw new IndexOutOfBoundsException("Given index is not definied yet!");
        }
        int counter = 0;
        Element el = this.head;
        while (index != counter) {
            el = el.getNext();
            counter++;
        }
        if (index == this.size() - 1) {
            el.setNext(null);
            return el.getValue();
        } else {
            el.setNext(el.getNext().getNext());
            return el.getNext().getValue();
        }
    }


    @Override
    public boolean remove(String o) {
        Element el = this.head;
        int counter = 0;
        while (o != el.getNext().getValue()) {
            el = el.getNext();
            counter++;
            if (counter == this.size()) {
                return false;
            }
        }
        if (counter - 1 == this.size() - 1) {
            el.setNext(null);
            return true;
        }
        el.setNext(el.getNext().getNext());
        return true;
    }

    @Override
    public int indexOf(String o) {
        Element el = this.head;

        int counter = 0;
        while (this.size() > counter) {
            if (o.equals(el.getValue())) {
                return counter - 1;
            }
            el = el.getNext();
            counter++;
        }
        if (this.size() == counter) {
            return this.size() - 1;
        }
        throw new IndexOutOfBoundsException("There is no search term in this linked list!");
    }

    @Override
    public int size() {
        int counter = 0;
        Element el = this.head;
        if (this.head == null) {
            return 0;
        } else {
            while (el.getNext() != null) {
                el = el.getNext();
                counter++;
            }
            return counter;
        }
    }
}
