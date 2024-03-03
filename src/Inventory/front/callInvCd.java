package Inventory.front;

import Inventory.controlers.generalMethods;

public class callInvCd {

    public void _callInvCd() {
        int option;
        generalMethods methoGen = new generalMethods();

        do {
            option = methoGen.getOptionProducts();
            switch (option) {
                case 0:
                    System.out.println("Saliendo opcion de productos en general...");
                    break;
                case 1:
                    System.out.println("Ver inventario...");
                    break;
                case 2:
                    System.out.println("agregando stock...");
                    break;
                case 3:
                    System.out.println("descontar del stock...");
                    break;
                case 4:
                    System.out.println("descontinuar producto...");
                    break;
                case 5:
                    System.out.println("Agregando al inventario");
                    break;
                default:
                    System.out.println("El valor ingresado no es valido...");
                    break;
            }

        } while (option !=0);
    }
}
