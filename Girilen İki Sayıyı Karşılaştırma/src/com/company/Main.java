package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    System.out.print("a sayisini girin : ");
    double a = scn.nextDouble();
    System.out.print("b sayisina girin : ");
    double b = scn.nextDouble();

    if(a>b)
    {
        System.out.println("a sayisi b sayisindan büyüktür...");
    }
    else if (a<b)
    {
        System.out.println("b sayisi a sayisindan büyüktür...");
    }
    else
    {
        System.out.println("iki sayi birbirine esittir");
    }
    }
}
