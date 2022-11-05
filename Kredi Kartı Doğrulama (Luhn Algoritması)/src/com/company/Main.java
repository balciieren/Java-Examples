package com.company;

import java.util.Scanner;

public class Main
   {
       static int basamakTopla(int sayi)
       {

    int toplam = 0;
        while (sayi != 0) {
        toplam += sayi % 10;
        sayi /= 10;
    }
        return toplam;
}
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kredi kartı no giriniz : ");
        String no = scn.next();
        int tekler=0,ciftler=0;
        for (int i=0;i<16;i++) {
            if (i % 2 == 0)
                ciftler += basamakTopla(2 * ((int) (no.charAt(i) - '0')));
            else
                tekler += ((int) ((int) (no.charAt(i) - '0')));
        }
        if((tekler+ciftler)%10==0)
            System.out.print("Doğru Kart Numarasi!");
        else
            System.out.print("Yanlis Kart Numarasi!");

        }
    }
