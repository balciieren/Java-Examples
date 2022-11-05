package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Birinci kenar uzunlugunu (a) girinz : ");
        double a = scn.nextDouble();
        System.out.print("ikinci kenar uzunluğunu (b) giriniz : ");
        double b = scn.nextDouble();
        System.out.print("Kwnarlar arasindaki aciyi (alfa-aci) giriniz : ");
        double aci = scn.nextDouble();

        double alan = a*b*Math.sin(aci*Math.PI/180)/2;
        System.out.println("Alab = "+alan);
    }
}
