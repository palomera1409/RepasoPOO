package com.tecmm.tala.lomeli.clases.repaso;

import java.util.Scanner;

/**
 * Created by lomeli on 23/02/18.
 */

public class programa3
{

    public programa3()
    {
        System.out.println("Conversor de temperatura");
        System.out.println("ingrese el tipo de grado que ingresara");
        System.out.println("1.- centrigrados");
        System.out.println("2.- kelvin");
        System.out.println("3.- fahrenhit");
        Scanner sc = new Scanner(System.in);
        int opcion= sc.nextInt();

float aux= (float) 1.8;
        if (opcion==1)
        {
            System.out.println("Dame los grados a convertir");
            float  centigrados = sc.nextInt();
            float kelvin = 273 +centigrados;
            System.out.println("En kelvin son = "+kelvin);
            float fire =  32+(aux*centigrados);
            System.out.println("en fahreneit son ="+fire);
                    }
 if (opcion==2)
 {
     System.out.println("Dame los grados a convertir");
     float kelvi= sc.nextInt();
      float centigrados =kelvi-273;
     float fire=aux*(kelvi-273)+32;
      System.out.println("En centigrados son =" +centigrados);
     System.out.println("En kelvin son = " + fire);


 }

 if(opcion==3)

 {
     System.out.println("Dame los grados a convertir");
     float fahreneit = sc.nextInt();
     float centigrado = (fahreneit-32)/aux;
     float kelvin=(fahreneit+459)*aux;
     System.out.println("en centigrado son= "+centigrado);
     System.out.println("en kelvin son ="+kelvin);


 }


    }
}
