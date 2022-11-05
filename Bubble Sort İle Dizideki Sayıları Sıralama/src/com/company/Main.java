package com.company;

public class Main {

    public static void main(String[] args) {
	int[] dizi = {7,8,5,2,4,6,3};

    for (int i = 0; i < dizi.length - 1; i++)
    {
        for (int j = 0; j< dizi.length - 1 -i; j++)
        {
            if (dizi[j+1] < dizi[j])
            {
                int temp = dizi[j+1];
                dizi[j+1] = dizi[j];
                dizi[j] = temp;
            }
        }
    }
    for (int i = 0; i<dizi.length; i++)
    {
        System.out.print(dizi[i] + "\t");
    }

    }
}
