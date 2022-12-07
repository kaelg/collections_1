package pl.waw.great.collections;

public class Element {
    private String value;
    private Element next;

    public String getValue() {
        return value;
    }

    public Element(String value, Element next) {
        this.value = value;
        this.next = next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
