package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kare Matris (NxN) için boyut giriniz : ");
        int N = scn.nextInt();
        int[] [] matris = new int [N] [N];
        for(int i=0 ; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                System.out.print((i+1) + ".satir-"+(j+1)+ ". sutun : ");
                matris[i][j] = scn.nextInt();
            }
            System.out.print("\n");
        }
    }
}
