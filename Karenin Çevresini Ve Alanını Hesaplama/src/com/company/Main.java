package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Karenin bir kenar uzunluğunu giriniz :");
        double u = scn.nextDouble();
        double cevre = u * 4;
        double alan = u * u;

        System.out.println("Cevre = "+cevre);
        System.out.println("Alan  = "+alan);
    }
}
