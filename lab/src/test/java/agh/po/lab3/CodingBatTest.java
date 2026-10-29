package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();
    @org.junit.Test
    public void diff21() {
        assertEquals(20, codingBat.diff21(1));
        assertEquals(8, codingBat.diff21(25));
        assertEquals(0, codingBat.diff21(21));
    }

    @org.junit.Test
    public void startHi() {
        assertEquals(true, codingBat.startHi("hiena"));
        assertEquals(true, codingBat.startHi("hi, hello, bye"));
        assertEquals(false, codingBat.startHi("Hi"));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(2, codingBat.countEvens(new int[]{1,2,3,4,5}));
        assertEquals(1, codingBat.countEvens(new int[]{1,2}));
        assertEquals(4, codingBat.countEvens(new int[]{1,2,4,6,8}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello Maksymilian!", codingBat.helloName("Maksymilian"));
    }
}