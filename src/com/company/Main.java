package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Total = new ArrayList<Integer>();
        int tiradas;
        int total;

        System.out.println("Numero de tiradas");
        tiradas=sc.nextInt();

        for (int i = 0; i < tiradas ; i++) {

            int dado1 = new Random().nextInt(5)+1;
            int dado2 = new Random().nextInt(5)+1;
            total=dado1+dado2;
            Total.add(total);
        }

        System.out.println(Total);
        for (int i = 2; i < 12; i++) {
            if(Collections.frequency(Total,i) != 0)
            System.out.println("Frecuencia del numero"+" "+i+" : "+Collections.frequency(Total,i));
        }
    }
}
