package com.tecmm.tala.lomeli.clases.repaso;

import java.util.Scanner;

/**
 * Created by lomeli on 23/02/18.
 */

public class programa2 {


    public programa2()
    {
        System.out.println("Bienvenidos Iva");
        System.out.println("-------------------------");
        System.out.println("cual fue el precio de tu producto");
        Scanner sc = new Scanner(System.in);
        float    precio= sc.nextInt();
        float    porcentaje= (16*precio)/100;
        float    total= precio+porcentaje;
        System.out.println("su total es =" + total);


    }
}
