package agh.po.lab3;

import java.lang.Math;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void mapAB() {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map1_test = new HashMap<>();
        map1_test.put("a", "Hi");
        map1_test.put("b", "There");
        map1_test.put("ab", "HiThere");

        assertEquals( map1_test, codingBat.mapAB(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map2_test = new HashMap<>();
        map2_test.put("a", "Hi");

        assertEquals(map2_test, codingBat.mapAB(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        Map<String, String> mapa3_test = new HashMap<>();
        mapa3_test.put("b", "There");

        assertEquals(mapa3_test, codingBat.mapAB(map3));
    }

    @org.junit.Test
    public void wordLen() {

        Map<String, Integer> wynik1 = new HashMap<>();
        wynik1.put("a", 1);
        wynik1.put("bb", 2);
        assertEquals(wynik1, codingBat.wordLen(new String[]{"a", "bb", "a", "bb"}));


        Map<String, Integer> wynik2 = new HashMap<>();
        wynik2.put("this", 4);
        wynik2.put("and", 3);
        wynik2.put("that", 4);
        assertEquals(wynik2, codingBat.wordLen(new String[]{"this", "and", "that", "and"}));

        Map<String, Integer> wynik3 = new HashMap<>();
        wynik3.put("code", 4);
        wynik3.put("bug", 3);
        assertEquals(wynik3, codingBat.wordLen(new String[]{"code", "code", "code", "bug"}));
    }



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