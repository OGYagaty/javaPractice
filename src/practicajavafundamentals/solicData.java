package practicajavafundamentals;
import java.util.Scanner;
public class solicData {
    private int i;

    public  void perdirDatos(){
        int maxSize = -1;
        String tempName="";
        double tempPrice;
        int tempQty=0;
        boolean statusProduct;
        int num = 1;

        do {
        try {
            System.out.println("Cuantos productos vas a insertar");
            maxSize = Integer.parseInt(scan());
            products[] product = new products[maxSize];

            for (int i = 0; i < maxSize; i++) {
                product[i] = new products();
                // Asignacion de variables
                System.out.println("Producto N° " + (i+1));
                product[i].setID(i + 1);
                System.out.print("Ingrese nombre del producto: ");
                product[i].setNameProduct(tempName=scan());
                System.out.print("Ingrese precio del producto: ");
                product[i].setPrice(tempPrice=Double.parseDouble(scan()));
                System.out.print("Ingrese numero de stock del producto: ");
                product[i].setStockNumber(tempQty=Integer.parseInt(scan()));
                System.out.print("Ingrese  Activo=true o Descatalogado=false: ");
                product[i].setProductStatus(statusProduct=Boolean.parseBoolean(scan()));
            }
            for (int i = 0; i < maxSize; i++) {
                System.out.println("*****************************");
                System.out.println("Producto " + (i + 1) + ":");
                System.out.println(product[i].toString());
                System.out.println("*****************************");
            }

        } catch (NumberFormatException E) {
            System.out.println("Valor invalido intente nuevamente! Inicie el proceso");
            System.out.println(E);
            num=2;
        }

        }while (num!=1);



    }


    public String scan(){
        Scanner in = new Scanner(System.in);
        String dato = in.nextLine();
        return dato;
    }

}




/*
version 1 solicitar Data
 Scanner in = new Scanner(System.in);
        products productOne = new products();
        productOne.setProductStatus(estado);
        System.out.println("Digita el ID del producto: ");
        int ID = in.nextInt();
        productOne.setID(ID);
        in.nextLine();

        System.out.println("Digita el nombre del producto: ");
        String tempName = in.nextLine();
        productOne.setNameProduct(tempName);

        System.out.println("Digita el precio del producto: ");
        double tempPrice= in.nextDouble();
        productOne.setPrice(tempPrice);
        in.nextLine();

        System.out.println("Digita la cantidad del producto: ");
        int tempQty= in.nextInt();
        productOne.setStockNumber(tempQty);
        in.nextLine();*/