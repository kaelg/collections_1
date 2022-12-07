package pl.waw.great.collections;

public class MyArraylist implements MyList {

    private String[] elements = new String[16];
    private int index = 0;

    public MyArraylist() {
    }

    @Override
    public boolean add(String element) {

        elements[index] = element;
        this.index = index + 1;
        return true;
    }

    @Override
    public String get(int index) {

        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String set(int index, String element) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        String old = this.elements[index];
        this.elements[index] = element;
        return old;
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        String removed = this.elements[index];
        this.elements[index] = null;


        for (int i = 0; i < size(); i++) {
            this.elements[i] = this.elements[i + 1];
        }

        return removed;
    }

    @Override
    public boolean remove(String o) {
        int in = this.indexOf(o);
        return this.remove(in) != null;
    }

    @Override
    public int indexOf(String element) {

        for (int i = 0; i < size(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int size() {
        return index;
    }
}
