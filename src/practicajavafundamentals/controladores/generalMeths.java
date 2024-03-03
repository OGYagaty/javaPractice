package practicajavafundamentals.controladores;

import java.util.Scanner;

public class generalMeths {
    public String scan() {
        Scanner in = new Scanner(System.in);
        String dato = in.nextLine();
        return dato;
    }

    //opciones generales
    public int generalOption() {
        System.out.println("1.Into inventory General");
        System.out.println("2.Into inventory CD and DVD");
        System.out.println("0.Exit");
        try {
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
            int numIntroduce = Integer.parseInt(scan());
            return numIntroduce;
        } catch (NumberFormatException e) {
            System.out.println("Error al leer la opcion!");
            return -1;
        }
    }

    //opciones para DVD Y CD
    public int getOptionCDandDVD() {
        System.out.println("1.View Inventory");
        System.out.println("2.Add Stock");
        System.out.println("3.Deduct Stock");
        System.out.println("4.Discontinue product");
        System.out.println("0.Exit");
        int numIntroduce = Integer.parseInt(scan());
        return numIntroduce;
    }

    public int getNumberProducts() {
        System.out.println("Cuantos productos vas a insertar");
        int maxSize = Integer.parseInt(scan());
        return maxSize;
    }

}
