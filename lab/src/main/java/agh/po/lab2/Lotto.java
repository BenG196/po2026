package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();
        while (lista.size() < 6) {
            int a = r.nextInt(1, 50);
            if (lista.contains(a) == false) {
                lista.add(a);
            }

        }
        int ilosc = 0;
        ArrayList<Integer> typy = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = Integer.parseInt(args[i]);
            typy.add(liczba);
            if (lista.contains(liczba)) {
                ilosc++;
            }
        }


        System.out.println(lista);
        System.out.println(typy);
        System.out.println("Liczba trafien: " + ilosc);
    }
}
