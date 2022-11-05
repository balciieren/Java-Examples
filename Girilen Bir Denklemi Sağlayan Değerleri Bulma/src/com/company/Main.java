package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
	int say = 0;
    Random rnd = new Random();
    while(true)
    {
        double x = rnd.nextInt(10);
        double y = rnd.nextInt(10);
        double z = rnd.nextInt(10);
        double dene = 10 + x + y / z + y * y + x / x;
        say++;
        if (dene == (int)dene && dene!=0.0) {
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Denklemin Sonucu = " + dene);
            System.out.println("Toplam " + say + " adimda bulundu!");
            break;
        }
      }

    }
}
