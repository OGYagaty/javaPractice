package Inventory.front;

import Inventory.controlers.generalMethods;
import Inventory.controlers.controlGeneralProducts;
import Inventory.models.dGeneralProd;
import java.util.ArrayList;
import java.util.List;
public class callInvGeneral {
    List<dGeneralProd> generalProd = new ArrayList<>();
    public void _callInvGeneral() {
        int option;
        generalMethods methoGen = new generalMethods();
        controlGeneralProducts cgp = new controlGeneralProducts();

        do {
            option = methoGen.getOptionProducts();
            switch (option) {
                case 0:
                    System.out.println("Saliendo opcion de productos en general...");
                    break;
                case 1:
                   // System.out.println("Ver inventario...");
                    cgp.displayProduct(generalProd);
                    break;
                case 2:
                    //System.out.println("agregando stock...");
                    cgp.addToStock(generalProd);
                    break;
                case 3:
                    //System.out.println("descontar del stock...");
                    cgp.deductStock(generalProd);
                    break;
                case 4:
                   // System.out.println("descontinuar producto...");
                    cgp.discountProductGen(generalProd);
                    break;
                case 5:
                    //System.out.println("Agregando al inventario");
                    cgp.addToInventoryGp(generalProd);
                    break;
                default:
                    System.out.println("El valor ingresado no es valido...");
                    break;
            }
        } while (option !=0);
    }
}
