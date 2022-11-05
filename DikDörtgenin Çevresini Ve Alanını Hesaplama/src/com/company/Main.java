package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    System.out.print("Dikdörtgenin uzunluğunu giriniz :");
    double k1 = scn.nextDouble();
    System.out.print("Dikdörgenin genişliğini giriniz :");
    double k2 = scn.nextDouble();
    double cevre = 2*(k1+k2);
    double alan = k1 * k2;

    System.out.println("Cevre ="+cevre);
    System.out.println("Alan ="+alan);
    }
}