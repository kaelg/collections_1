package pl.waw.great.collections;

public interface MyList {

    boolean add(String element);

    String get(int index);

    String set(int index, String element);

    String remove(int index);

    boolean remove(String o);

    int indexOf(String o);


    int size();
}
