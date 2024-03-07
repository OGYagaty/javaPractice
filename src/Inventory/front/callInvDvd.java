package Inventory.front;

import Inventory.controlers.controlDvd;
import Inventory.controlers.generalMethods;
import Inventory.models.dDvd;
import Inventory.models.dGeneralProd;

import java.util.ArrayList;
import java.util.List;

public class callInvDvd {
    List<dDvd> dvdProduct = new ArrayList<>();
    public void _callInvDvd() {
        int option;
        generalMethods methoGen = new generalMethods();
        controlDvd cDvd = new controlDvd();

        do {
            option = methoGen.getOptionProducts();
            switch (option) {
                case 0:
                    System.out.println("Saliendo opcion de DVD peliculas...");
                    break;
                case 1:
                    //System.out.println("Ver inventario...");
                    cDvd.displayProductDvd(dvdProduct);
                    break;
                case 2:
                    //System.out.println("agregando stock...");
                    cDvd.addToStockDvd(dvdProduct);
                    break;
                case 3:
                    System.out.println("descontar del stock...");
                    cDvd.deductStockDvd(dvdProduct);
                    break;
                case 4:
                    System.out.println("descontinuar producto...");
                    cDvd.discountProductGenDvd(dvdProduct);
                    break;
                case 5:
                    System.out.println("Agregando al inventario");
                    cDvd.addToInventoryDVD(dvdProduct);
                    break;
                default:
                    System.out.println("El valor ingresado no es valido...");
                    break;
            }

        } while (option !=0);
    }
}
