package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int s = scn.nextInt();
        if (s % 2 == 0)
        {
            System.out.println("Girilen sayi bir cift sayidir...");
        }
        else
        {
            System.out.println("Girilen sayi bir te6k sayidir...");
        }
    }
}