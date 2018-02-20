package com.tecmm.tala.lomeli.clases;



public class Motocicletas extends Carro
{

    boolean casco;
    int cangasolina;


public Motocicletas()
{

    super("generica");

}

public Motocicletas(String nombre)
{
    super(nombre);
}


          @Override
          public void datoVehiculo() {
          super.datoVehiculo();
              System.out.println("Casco. "+ isCasco()+"Gasolina: " + getCangasolina());


                                     }

             public boolean isCasco()
             {
                 return casco;
             }

            public void setCasco(boolean casco) {
                this.casco = casco;
            }

               public int getCangasolina() {
                return cangasolina;
                                            }

             public void setCangasolina(int cangasolina)
             {
               this.cangasolina = cangasolina;
             }



}
