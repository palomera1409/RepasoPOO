package com;

import java.util.Scanner;

/**
 * Created by lomeli on 23/02/18.
 */

public class Programa1
{

    public Programa1()
    {

        System.out.println("BIENVENIDOS");
        System.out.println("************+++");
        System.out.println("");
        System.out.println("Dame la base del triangulo");
        Scanner sc = new Scanner(System.in);
        float base = sc.nextInt();
        System.out.println("Dame la altura del triangulo");
        float altura =sc.nextInt();
        float total = (base+altura)/2;
        System.out.println("");

        System.out.println("el resultado es = " + total );



    }
}
