package pl.waw.great.collections;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListTest {

    @Test
    void add() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals("bulka", list.get(0));
        assertEquals("chleb", list.get(1));
        assertEquals("maslo", list.get(2));
        assertEquals("maka", list.get(3));
        assertEquals("drozdze", list.get(4));
        assertEquals("cukier", list.get(5));
        assertEquals("ziarna", list.get(6));
    }

    @Test
    void get() {
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        for (int j = 0; j < 100; j++) {
            assertEquals(String.valueOf(j), list.get(j));
        }
    }

    @Test
    void set() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals("bulka", list.set(3, "bulka"));
        assertEquals("bulka", list.get(3));
        assertEquals("drozdze", list.get(4));
        assertEquals("ziarna", list.get(6));
        assertEquals("jajka", list.set(6, "jajka"));
        assertEquals("jajka", list.get(6));
        assertEquals("bulka", list.get(0));
        assertEquals("jajka", list.set(0, "jajka"));
        assertEquals("jajka", list.get(0));
        assertEquals("chleb", list.get(1));
        assertEquals("maslo", list.get(2));

    }

    @Test
    void remove_int() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals("cukier", list.remove(6));
        assertEquals("cukier", list.get(5));
        assertEquals(null, list.get(6));
        assertEquals("drozdze", list.remove(5));
        assertEquals("drozdze", list.get(4));
        assertEquals("chleb", list.remove(0));
        assertEquals("chleb", list.get(0));
    }

    @Test
    void remove_str() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals(true, list.remove("bulka"));
        assertEquals("chleb", list.get(0));
        assertEquals(false, list.remove("bulka"));
        assertEquals(true, list.remove("ziarna"));
        assertEquals("cukier", list.get(4));
        assertEquals(true, list.remove("maka"));
        assertEquals("chleb", list.get(0));
        assertEquals("maslo", list.get(1));
        assertEquals("drozdze", list.get(2));
        assertEquals("cukier", list.get(3));
    }

    @Test
    void indexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals(0, list.indexOf("bulka"));
        assertEquals(6, list.indexOf("ziarna"));
        assertEquals(3, list.indexOf("maka"));
        assertEquals("bulka", list.get(list.indexOf("bulka")));
        assertEquals("cukier", list.remove(4));
        assertEquals("cukier", list.get(4));
        assertEquals("cukier", list.get(list.indexOf("cukier")));
        assertEquals(4, list.indexOf("cukier"));
        list.add("ziarna");
        assertEquals("ziarna", list.get(6));
        assertEquals("jajka", list.set(6, "jajka"));
        assertEquals("jajka", list.get(6));
        assertEquals("bulka", list.get(list.indexOf("bulka")));

    }

    @Test
    void size() {
        MyLinkedList list = new MyLinkedList();
        list.add("bulka");
        list.add("chleb");
        list.add("maslo");
        list.add("maka");
        list.add("drozdze");
        list.add("cukier");
        list.add("ziarna");
        assertEquals(7, list.size());
        assertEquals(true, list.remove("bulka"));
        assertEquals("cukier", list.remove(5));
        assertEquals(5, list.size());
        list.add("bulka");
        assertEquals(6, list.size());
        assertEquals("jajka", list.set(5, "jajka"));
        assertEquals(6, list.size());

    }
}
