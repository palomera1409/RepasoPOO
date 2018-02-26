package com.tecmm.tala.lomeli.clases.repaso;

import java.util.Scanner;

/**
 * Created by lomeli on 26/02/18.
 */

public class programa9
{
    public programa9()
    {

        System.out.println("BIENVENIDOS");
        System.out.println("dame el numero para sacar el factorial");
        Scanner sc = new Scanner(System.in);
         int x= sc.nextInt();
         int factorial=1;

         for (int i = 1; i<=x; i++)
         {
             factorial+=factorial*i;
         }

    }
}
