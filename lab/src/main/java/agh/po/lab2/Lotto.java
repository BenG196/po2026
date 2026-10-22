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

        int liczbaLosowan = 1;
        long czaspoczatkowy = System.currentTimeMillis(); // 1. Zmieniono int na long

        while (ilosc < 6) {
            liczbaLosowan++;

            lista.clear();

            while (lista.size() < 6) {
                int a = r.nextInt(1, 50);
                if (lista.contains(a) == false) {
                    lista.add(a);
                }
            }
            ilosc = 0;

            for (int i = 0; i < 6; i++) {
                if (lista.contains(typy.get(i))) {
                    ilosc++;
                }
            }
        }
        long czasKoncowy = System.currentTimeMillis();
        long czasDzialania = czasKoncowy - czaspoczatkowy;
        System.out.println("Liczba potrzebnych losowan: " + liczbaLosowan);
        System.out.println("Laczny czas dzialania: " + czasDzialania + " ms");
    }
}