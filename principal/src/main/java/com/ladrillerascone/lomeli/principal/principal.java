package com.ladrillerascone.lomeli.principal;


import com.tecmm.tala.lomeli.clases.Carro;
import com.tecmm.tala.lomeli.clases.Motocicletas;

public class principal
{
    public static void main(String[] args)
    {
        System.out.println("prueba");
        Carro cnuevo = new Carro("mazda");
        cnuevo.setColor("Verde,plata");
        cnuevo.setModelo(2000);

        cnuevo.datoVehiculo();
        System.out.println("-------------------------------------------------------------------");

        Carro cusado = new Carro("nissan");
        cusado.setModelo(1960);
        cusado.setColor("Gris");
        cusado.datoVehiculo();
        cnuevo.datoVehiculo();

        System.out.println("---------------------");
        Motocicletas motocicletas= new Motocicletas();
        motocicletas.setModelo(3000);
        motocicletas.datoVehiculo();
        System.out.println("---------------------------------");

        Motocicletas moto1= new Motocicletas("ITALIK        A");
        moto1.setColor("rojo");
        moto1.setModelo(2016);
        moto1.setCasco(true);
        moto1.setCangasolina(30);
        moto1.datoVehiculo();
     imprimeautos(cnuevo,moto1,cusado);


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
