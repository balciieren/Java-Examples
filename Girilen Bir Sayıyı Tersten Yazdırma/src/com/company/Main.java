package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi;
        System.out.print("Tersten yazdiralacak sayiyi giriniz : ");
        sayi=scn.nextInt();

        while(sayi!=0)
        {
            System.out.print(sayi%10);
            sayi/=10;
        }
    }
}
