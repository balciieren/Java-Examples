package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int baslangic,bitiş,adim,toplam=0;
        System.out.print("Baslangic değerini giriniz : ");
        baslangic = scn.nextInt();
        System.out.print("Bitis degerini giriniz : ");
        bitiş = scn.nextInt();
        System.out.print("Adım degerini giriniz : ");
        adim = scn.nextInt();

        for (int i = baslangic ; i<=bitiş ; i+=adim)
        {
            toplam += i;
        }
        System.out.println("Toplam = "+toplam);
    }
}
