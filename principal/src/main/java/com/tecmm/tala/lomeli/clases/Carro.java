package com.tecmm.tala.lomeli.clases;

/**
 * Created by lomeli on 19/02/18.
 */

public class Carro
{

    int modelo;

    public String color;
    public String  nombre;

   public  Carro(  String nombre)
   {
      this.nombre= nombre;

   }


       public void datoVehiculo()
         {
             int y= 90;
             System.out.println(modelo+"   " + color+"      " +nombre+"  ");
             System.out.println("el carro corre a:"+ y +"km");
         }

       public void setModelo(int m)
         {
             modelo= m;
         }

        public void   setColor (String color)
         {
          this.color= color;

         }



}
