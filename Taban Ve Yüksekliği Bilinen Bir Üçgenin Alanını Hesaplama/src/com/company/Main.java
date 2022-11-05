package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
        System.out.print("Ucgenin taban uzunlugunu (x) giriniz : ");
        double x = scn.nextDouble();
        System.out.print("Ucgenin yüksekliğini (h) giriniz : ");
        double h = scn.nextDouble();

    double alan = x*h/2;
    System.out.println("Alan = "+alan);
    }
}
