package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    System.out.print("Kilometre cinsinden uzunluğu (x) giriniz : ");
    Double x = scn.nextDouble();

    Double Mil = (0.621) * x;
    System.out.println("Mil = "+Mil);
    }
}