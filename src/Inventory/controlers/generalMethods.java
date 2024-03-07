package Inventory.controlers;

import Inventory.models.dDvd;
import Inventory.models.dCd;
import Inventory.models.dGeneralProd;

import java.util.List;
import java.util.Scanner;

public class generalMethods {
    public String scan() {
        Scanner in = new Scanner(System.in);
        String dato = in.nextLine();
        return dato;
    }

    public int generalOption() {
        System.out.println("1.Into inventory General");
        System.out.println("2.Into inventory CD");
        System.out.println("3.Into inventory DVD");
        System.out.println("0.Exit");
        try {
            System.out.print("->");
            int numIntroduce = Integer.parseInt(scan());
            return numIntroduce;
        } catch (NumberFormatException e) {
            System.out.println("Error al leer la opcion!");
            return -1;
        }
    }

    //opciones para producto en general
    public int getOptionProducts() {
        System.out.println("1.View Inventory");
        System.out.println("2.Add Stock");
        System.out.println("3.Deduct Stock");
        System.out.println("4.Discontinue product");
        System.out.println("5.Into New product");
        System.out.println("0.Exit");
        try {
            System.out.print("->");
            int numIntroduce = Integer.parseInt(scan());
            return numIntroduce;
        } catch (NumberFormatException e) {
            System.out.println("Error al leer la opcion!");
            return -1;
        }
    }

    public int getNumberStock(List<dGeneralProd> generalProd) {
        int choiceOption;
            for (dGeneralProd gn : generalProd) {
                System.out.print("ID: " + gn.getID() + " Producto: " + gn.getNameProduct());
                System.out.print(" | ");
            }
        System.out.println("\n Escoja un ID del producto a modificar...");
            return choiceOption = Integer.parseInt(scan());

    }

    public int getNumberStockDvd(List<dDvd> dvdProduct) {
        int choiceOption;
        for (dDvd pDvd : dvdProduct) {
            System.out.print("#: " + pDvd.getID() + " Pelicula: " + pDvd.getNameProduct());
            System.out.print(" | ");
        }
        System.out.println("\n Escoja un ID del producto a modificar...");
        return choiceOption = Integer.parseInt(scan());

    }

    public int getNumberStockCd(List<dCd> cdProduct) {
        int choiceOption;
        for (dCd pCd : cdProduct) {
            System.out.print("#: " + pCd.getID() + " Nombre CD: " + pCd.getNameProduct());
            System.out.print(" | ");
        }
        System.out.println("\n Escoja un ID del producto a modificar...");
        return choiceOption = Integer.parseInt(scan());

    }

}
