package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numar;
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (Integer I = 0; I < 15; I++) {
            numar = random.nextInt(20);
            lista.add(numar);
        }
        for(Integer element : lista)
        {
            System.out.println(element + " ");
        }
    }
}
