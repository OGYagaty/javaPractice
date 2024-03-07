package Inventory.front;

import Inventory.controlers.controlCd;
import Inventory.controlers.generalMethods;
import Inventory.models.dCd;

import java.util.ArrayList;
import java.util.List;

public class callInvCd {
    List<dCd> cdProduct = new ArrayList<>(){};

    public void _callInvCd() {
        int option;
        generalMethods methoGen = new generalMethods();
        controlCd cCd = new controlCd();

        do {
            option = methoGen.getOptionProducts();
            switch (option) {
                case 0:
                    System.out.println("Saliendo opcion de CD:Musica...");
                    break;
                case 1:
                  //  System.out.println("Ver inventario...");
                    cCd.displayProductCD(cdProduct);
                    break;
                case 2:
                  //  System.out.println("agregando stock...");
                    cCd.addToStockCD(cdProduct);
                    break;
                case 3:
                  //  System.out.println("descontar del stock...");
                    cCd.deductStockCD(cdProduct);
                    break;
                case 4:
                   // System.out.println("descontinuar producto...");
                    cCd.discountProductGenCD(cdProduct);
                    break;
                case 5:
                    //System.out.println("Agregando al inventario");
                    cCd.addToInventoryCD(cdProduct);
                    break;
                default:
                    System.out.println("El valor ingresado no es valido...");
                    break;
            }

        } while (option !=0);
    }
}
