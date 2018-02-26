package com.tecmm.tala.lomeli.clases.repaso;

import java.util.Scanner;

/**
 * Created by lomeli on 23/02/18.
 */

public class programa4
{
    public programa4()
    {

        System.out.println("Bienvenidos");
        System.out.println("++++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la hora en fromato de 0 a 23");
        float var=sc.nextInt();

        if (var<=12)

        {
            System.out.println(var + "AM");

        }

        if (var>12)
        {


            int x;
            for (x = 12; x>=var; x--)
            {
               int var1= (int) (var-x);
                System.out.println(var1+ "PM");


            }

        }



    }
}
