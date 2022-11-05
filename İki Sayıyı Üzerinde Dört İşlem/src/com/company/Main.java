package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn  = new Scanner(System.in);
    int a,b;
    System.out.print("İlk Sayıya (a) giriniz:");
    a = scn.nextInt();
    System.out.print("İkinci Sayıya (b) giriniz:");
    b = scn.nextInt();
    int T = a+b;
    int F = a-b;
    int C = a*b;
    int B = a/b;
        System.out.println("Toplam = " +T);
        System.out.println("Toplam = " +F);
        System.out.println("Toplam = " +C);
        System.out.println("Toplam = " +B);
    }
}
