package practicajavafundamentals.front;

import practicajavafundamentals.controladores.*;
import practicajavafundamentals.data.*;

public class callProducts {

//    logica y orden del programa

    public void callProd() {
        products[] productG = new products[]{
                //new products(1, "Defaut", 0, 0)
        };
        cd[] CD = new cd[]{};
        dvd[] DVD = new dvd[]{};

        generalMeths gM = new generalMeths();
        productMeths pM = new productMeths();
        int option = -1;
        int optionGp = -1;

        do {
            option = gM.generalOption();

            //seleccion de la opcion 1
            if (option == 1) {
                System.out.println("Inventario de productos generales");
                do {

                    optionGp = gM.getOptionProducts();
                    switch (optionGp) {
                        case 1:
                            pM.displayInventory(productG);
                            break;
                        case 2:
                            pM.addInventory(productG);
                            break;
                        case 3:
                            pM.deductInventory(productG);
                            break;
                        case 4:
                            pM.discontinueProduct(productG);
                            break;
                        case 5:
                            pM.addToInventory(productG);
                            break;
                        default:
                            System.out.println("Valor no valido!");
                            break;
                    }


                } while (optionGp != 0);


            } else if (option == 2) {
                System.out.println("Inventario de productos DVD y CD");
            } else if (option == 0) {
                System.out.println("Adios!");
            } else {
                System.out.println("Valor no valido");
            }


        } while (option != 0);


    }


}
