package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] dizi = {1,2,3,4,5,6,7,8,9,10};
        int ara,yer=-1;
        System.out.print("Aramak istediğiniz sayiyi giriniz : ");
        ara = scn.nextInt();
        for (int i=0; i< dizi.length; i++)
        {
            if(dizi[i]==ara)
            {
                yer=i;
                break;
            }
        }
        if(yer!=-1)
            System.out.println("Aranilan eleman bulundu. İndis Numarasi : "+yer);
        else
            System.out.println("Aranilan eleman bulunamadi");
    }
}
