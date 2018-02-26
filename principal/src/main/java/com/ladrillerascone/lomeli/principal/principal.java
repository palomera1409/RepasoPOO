package com.ladrillerascone.lomeli.principal;


import com.Programa1;
import com.programa2;
import com.programa3;
import com.programa4;
import com.tecmm.tala.lomeli.clases.Carro;
import com.tecmm.tala.lomeli.clases.Motocicletas;
import com.tecmm.tala.lomeli.clases.programa5;
import com.tecmm.tala.lomeli.clases.programa6;
import com.tecmm.tala.lomeli.clases.repaso.programa7;
import com.tecmm.tala.lomeli.clases.repaso.programa8;

public class principal
{
    public static void main(String[] args)
    {

        //Programa1 triangulo = new Programa1();
        //System.out.println("+++++++++++++++++++++++++++");
       // programa2 Iva = new programa2();
        //System.out.println("---------------------------");
       // programa3 temperatura = new programa3();
        //System.out.println("++++++++++++++++++++++++++++");
      //  programa4 hora = new programa4();
        //System.out.println("++++++++++++++++++++++++++++++");
        //programa5 doble = new programa5();
        //System.out.println("########");
       // programa6 nombre = new programa6();
       // programa7 numero= new programa7();
       // System.out.println("---------------------------------");
        programa8 ciclo = new programa8();


////////++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



       // System.out.println("prueba");
        //Carro cnuevo = new Carro("mazda");
       // cnuevo.setColor("Verde,plata");
       // cnuevo.setModelo(2000);

       // cnuevo.datoVehiculo();
       // System.out.println("-------------------------------------------------------------------");
        // Carro cusado = new Carro("nissan");
        //cusado.setModelo(1960);
        //cusado.setColor("Gris");
       // cusado.datoVehiculo();
        //cnuevo.datoVehiculo();

        ///System.out.println("---------------------");
       // Motocicletas motocicletas= new Motocicletas();
       // motocicletas.setModelo(3000);
       // motocicletas.datoVehiculo();
       // System.out.println("---------------------------------");

//(        Motocicletas moto1= new Motocicletas("ITALIK        A");
  //      moto1.setColor("rojo");
   //     moto1.setModelo(2016);
    //    moto1.setCasco(true);
      //  moto1.setCangasolina(30);
        //moto1.datoVehiculo();
    // imprimeautos(cnuevo,moto1,cusado);


    }

    public static void imprimeautos(Carro...c)
{
   System.out.println("######################");
    System.out.println("Imprimiendo");
    for(Carro carro : c)
    {
        carro.datoVehiculo();
        System.out.println("-------");
    }

}

}
