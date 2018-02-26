package com.tecmm.tala.lomeli.clases.repaso;

import java.util.Scanner;

/**
 * Created by lomeli on 24/02/18.
 */

public class programa6
{

    public programa6()
    {
        System.out.println("BIENVENIDOS....");
        System.out.println("ingresa tu nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("ingresa las veses que deseas que se repita tu nombre");
        int x = sc.nextInt();

        int i;
        for (i=1; i<=x; i++)
        {
            System.out.println( i+".- "+ "tu nombre es " + nombre);

        }


    }
}
