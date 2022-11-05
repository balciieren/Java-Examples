package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Üçgenin 1. dik kenar uzunlugunu giriniz : ");
        double k1 = scn.nextDouble();
        System.out.print("Ucgenin 2. dik kenar uzunluğunu giriniz : ");
        double k2 = scn.nextDouble();

        double hipotenus = Math.sqrt(k1*k1 + k2*k2);
        System.out.println("Hipotenus ="+hipotenus);
    }
}
