package practicajavafundamentals;

import java.util.Scanner;

public class solicData {
    private int maxSize;
    private String tempName = "";
    private double tempPrice;
    private int tempQty = 0;
    private boolean statusProduct;
    private int num = 1;

    public void addToInventory(products[] product) {
        do {
            try {
                int maxsizeP = getNumberProducts();
                for (int i = 0; i < maxsizeP; i++) {
                    product[i] = new products();
                    // Asignacion de variables
                    System.out.println("Producto N° " + (i + 1));
                    product[i].setID(i + 1);
                    System.out.print("Ingrese nombre del producto: ");
                    product[i].setNameProduct(tempName = scan());
                    System.out.print("Ingrese precio del producto: ");
                    product[i].setPrice(tempPrice = Double.parseDouble(scan()));
                    System.out.print("Ingrese numero de stock del producto: ");
                    product[i].setStockNumber(tempQty = Integer.parseInt(scan()));
                    product[i].setProductStatus(statusProduct = StatusProd());
                }
                displayInventory(product);

            } catch (NumberFormatException E) {
                System.out.println("Valor invalido intente nuevamente! Inicie el proceso");
                System.out.println(E);
                num = 2;
            }

        } while (num != 1);


    }

//    public  void perdirDatos(){
//
//
//        do {
//        try {
//            System.out.println("Cuantos productos vas a insertar");
//            maxSize = Integer.parseInt(scan());
//            products[] product = new products[maxSize];
//
//            for (int i = 0; i < maxSize; i++) {
//                product[i] = new products();
//                // Asignacion de variables
//                System.out.println("Producto N° " + (i+1));
//                product[i].setID(i + 1);
//                System.out.print("Ingrese nombre del producto: ");
//                product[i].setNameProduct(tempName=scan());
//                System.out.print("Ingrese precio del producto: ");
//                product[i].setPrice(tempPrice=Double.parseDouble(scan()));
//                System.out.print("Ingrese numero de stock del producto: ");
//                product[i].setStockNumber(tempQty=Integer.parseInt(scan()));
//                System.out.print("Ingrese  Activo=true o Descatalogado=false: ");
//                product[i].setProductStatus(statusProduct=Boolean.parseBoolean(scan()));
//            }
//            displayInventory(product);
//
//        } catch (NumberFormatException E) {
//            System.out.println("Valor invalido intente nuevamente! Inicie el proceso");
//            System.out.println(E);
//            num=2;
//        }
//
//        }while (num!=1);
//
//
//
//    }

    public String scan() {
        Scanner in = new Scanner(System.in);
        String dato = in.nextLine();
        return dato;
    }

    public void displayInventory(products[] prod) {
//UTILIZANDO FOR EACH
        if (prod.length == 0) {
            System.out.println("No hay productos actualmente");
        } else {
            for (products Produst : prod) {

                int i = 0;
                System.out.println("*****************************");
                System.out.println("Producto ID " + (Produst.getID()));
                System.out.println(Produst.toString());
                System.out.println("*****************************");

            }
        }


//        for (int i = 0; i < maxSize; i++) {
//            System.out.println("*****************************");
//            System.out.println("Producto " + (i + 1) + ":");
//            System.out.println(prod[i].toString());
//            System.out.println("*****************************");
//        }
    }

    //metodo para pedir valores a insertar
    public int getNumberProducts() {
        System.out.println("Cuantos productos vas a insertar");
        maxSize = Integer.parseInt(scan());
        return maxSize;
    }

    public boolean StatusProd() {
        System.out.print("Estado del producto Activo=1 , Descatalogado=cualquier caracter diferente a 1 : ");
        String valor = scan();
        if (valor.equals("1")) {
            return true;
        }
        return false;


    }

    //metodo para escoger la opcion
    public int getOption() {
        //options
        System.out.println("1.View Inventory");
        System.out.println("2.Add Stock");
        System.out.println("3.Deduct Stock");
        System.out.println("4.Discontinue product");
        System.out.println("0.Exit");
        int numIntroduce = Integer.parseInt(scan());
        return numIntroduce;
    }

    // obcion para obternet el id de un producto que este en el arreglo
    public int getProductNumber(products[] prod) {

        int productChoice = -1;
        boolean valid = false;
        do {
            try {
                System.out.println("Escoja el id del producto: ");
                productChoice = Integer.parseInt(scan());
                for (int i = 0; i < prod.length; i++) {
                    if (prod[i].getID() == productChoice) {
                        valid = true;
                        System.out.println("*****************************");
                        System.out.println("Id: " + prod[i].getID() + ", Producto: " + prod[i].getNameProduct());
                        System.out.println("*****************************");
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Id de producto no encontrado");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al leer el dato ingresado" + e);

            }
        } while (!valid);
        return productChoice;
    }

    //opcion para agregar al stock de un id un valor
    public void addInventory(products[] prod) {
        //sumar al inventario el valor ingresado.

        int productChoice = getProductNumber(prod);
        try {
            System.out.println("Cuantos productos vas agregar al stock?");
            int updateValue = Integer.parseInt(scan());
            if (updateValue <= 0) {
                System.out.println("El valor ingresado debe ser superior a 0");
            } else {

            }
            for (int i = 0; i < prod.length; i++) {
                if (prod[i].getID() == productChoice) {
                    prod[i].setStockNumber(prod[i].getStockNumber() + updateValue);
                    System.out.println("Operacion Exitosa!");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Hubo un error al leer el valor ingresado!");
        }
    }

    public void deductInventory(products[] prod) {
        //metodo para restar del inventario actual
        int productChoice = getProductNumber(prod);
        try {
            System.out.println("Cuantos productos vas a sacar del stock?");
            int updateValue = Integer.parseInt(scan());
            if (updateValue <= 0) {
                System.out.println("El valor ingresado debe ser superior a 0");
            } else {
                for (int i = 0; i < prod.length; i++) {
                    if (prod[i].getID() == productChoice) {
                        if (prod[i].getStockNumber() >= updateValue) {
                            prod[i].setStockNumber(prod[i].getStockNumber() - updateValue);
                            System.out.println("Operacion Exitosa!");
                            break;
                        } else {
                            System.out.println("El valor ingresado no debe superar el valor de stock actual!");
                        }


                    }
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("Hubo un error al leer el valor ingresado!");
        }

    }

    //metodo para descontinuar un producto
    public void discontinueProduct(products[] prod) {
        int productChoice = getProductNumber(prod);
        try {
            System.out.println("El producto a descontinuar es:" + productChoice +
                    " si esta seguro introduzca 1 para confirmar de lo contrario introduzca otro valor: ");
            String confirm = scan();
            if (confirm.equals("1")) {
                for (int i = 0; i < prod.length; i++) {
                    if (prod[i].getID() == productChoice) {
                        prod[i].setProductStatus(false);
                        System.out.println("Operacion Exitosa!");
                        break;
                    }

                }
            }else
            {
                System.out.println("Operacion no exitosa!");
            }


        } catch (NumberFormatException e) {
            System.out.println("Hubo un error al descontinuar el prodcuto...");
        }


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