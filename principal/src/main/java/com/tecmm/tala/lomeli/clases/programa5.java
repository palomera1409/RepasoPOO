package com.tecmm.tala.lomeli.clases;

import java.util.Scanner;

/**
 * Created by lomeli on 24/02/18.
 */

public class programa5
{
    public programa5()
    {
        System.out.println("Bienvenidos.....");
        System.out.println("Dame el numero a multiplicar");
        Scanner sc = new Scanner(System.in);
         float x = sc.nextInt();

         if( x<50)

         {
           float total = x*2;
             System.out.println("el resultado es =" + total);
         }
         else
             {

                 float total= x*3;
                 System.out.println("el resultado es = "+ total);

             }


    }
}
