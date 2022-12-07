package pl.waw.great.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraylistTest {

    @Test
    void add() {
        MyArraylist list = new MyArraylist();

        list.add("Bułka");
        list.add("chleb");

        assertEquals(2, list.size());
    }

    @Test
    void get() {
        MyArraylist list = new MyArraylist();
        list.add("Bułka");
        String element = list.get(0);
        assertEquals("Bułka", element);
    }

    @Test
    void set() {
        MyArraylist list = new MyArraylist();
        list.add("Bułka");
        list.add("chleb");

        String chleb = list.set(1, "masło");

        assertEquals("chleb", chleb);
        assertEquals(list.get(1), "masło");
    }

    @Test
    void remove() {
        MyArraylist list = new MyArraylist();
        list.add("bułka");
        list.add("chleb");
        list.add("masło");

        String remove = list.remove(0);

        assertEquals("bułka", remove);
        assertEquals(list.get(0), "chleb");
        assertEquals(list.get(1), "masło");
    }

    @Test
    void indexOf() {
        MyArraylist list = new MyArraylist();
        list.add("bułka");
        list.add("chleb");
        list.add("masło");

        assertEquals(0, list.indexOf("bułka"));
    }

    @Test
    void testRemove() {
        MyArraylist list = new MyArraylist();
        list.add("bułka");
        list.add("chleb");
        list.add("masło");

        boolean isRemoved = list.remove("bułka");

        assertTrue(isRemoved);
        assertEquals(list.get(0), "chleb");
        assertEquals(list.get(1), "masło");
    }
}