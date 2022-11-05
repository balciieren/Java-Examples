package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int taban,kuvvet,sonuc=1;
        System.out.print("Üssü alinacak sayiyi (taban) giriniz : ");
        taban = scn.nextInt();
        System.out.print("Üs kuvvetini (kuvvet) giriniz : ");
        kuvvet = scn.nextInt();

        for (int i=1 ; i<=kuvvet ; i++)
        {
            sonuc*=taban;
        }
        System.out.println("Sonuc = "+sonuc);
    }
}
