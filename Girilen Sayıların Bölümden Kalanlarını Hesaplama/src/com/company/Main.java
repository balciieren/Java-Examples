package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        int n=0;
        do {
            System.out.print("Mod'u alinacak sayiyi (a) giriniz : ");
            a = scn.nextInt();
            System.out.print("Hangi mod'un alinacagini (b) giriniz : ");
            b = scn.nextInt();
            System.out.println(a + " mod " + b + " = " + a % b);
        }while (a!=0);
        System.out.println("O sayisi girildi ve cikildi.......");
    }
}
