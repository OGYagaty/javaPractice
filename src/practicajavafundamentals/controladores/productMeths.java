package practicajavafundamentals.controladores;

import practicajavafundamentals.data.products;

import java.util.Scanner;

public class productMeths {
    private int maxSize;
    private String tempName = "";
    private double tempPrice;
    private int tempQty = 0;
    private boolean statusProduct;
    private int num = 1;

    generalMeths gM = new generalMeths();

    //agrega un productos en general
    public void addToInventory(products[] product) {
        do {
            try {
                products[] product1 = new products[1];;
                if (product.length == 0 ){

                }
               // int maxsizeP = gM.getNumberProducts();
                for (int i = 0; i < 1; i++) {
                    product1[i] = new products();
                    System.out.println("Producto N° " + (product.length + 1));
                    product[i].setID(product.length + 1);
                    System.out.print("Ingrese nombre del producto: ");
                    product[i].setNameProduct(tempName = gM.scan());
                    System.out.print("Ingrese precio del producto: ");
                    product[i].setPrice(tempPrice = Double.parseDouble(gM.scan()));
                    System.out.print("Ingrese numero de stock del producto: ");
                    product[i].setStockNumber(tempQty = Integer.parseInt(gM.scan()));
                    product[i].setProductStatus(true);
                }
            } catch (NumberFormatException E) {
                System.out.println("Valor invalido intente nuevamente! Inicie el proceso");
                System.out.println(E);
                num = 2;
            }

        } while (num != 1);
    }

    public void displayInventory(products[] prod) {
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
    }

    // obcion para obternet el id de un producto que este en el arreglo
    public int getProductNumber(products[] prod) {
        int productChoice = -1;
        boolean valid = false;
        do {
            try {
                System.out.println("Escoja el id del producto: ");
                productChoice = Integer.parseInt(gM.scan());
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

        if (prod.length == 0) {
            System.out.println("No hay productos para mostrar!");
        } else {
            int productChoice = getProductNumber(prod);
            try {
                System.out.println("Cuantos productos vas agregar al stock?");
                int updateValue = Integer.parseInt(gM.scan());
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
    }

    //metodo para bajar el numero del stock
    public void deductInventory(products[] prod) {
        if (prod.length == 0) {
            System.out.println("No hay prodcutos para mostrar");
        } else {
            //metodo para restar del inventario actual
            int productChoice = getProductNumber(prod);
            try {
                System.out.println("Cuantos productos vas a sacar del stock?");
                int updateValue = Integer.parseInt(gM.scan());
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


    }

    //metodo para descontinuar un producto
    public void discontinueProduct(products[] prod) {
        if (prod.length == 0) {
            System.out.println("No hay productos para mostrar!");
        } else {
            int productChoice = getProductNumber(prod);
            try {
                System.out.println("El producto a descontinuar es:" + productChoice +
                        " si esta seguro introduzca 1 para confirmar de lo contrario introduzca otro valor: ");
                String confirm = gM.scan();
                if (confirm.equals("1")) {
                    for (int i = 0; i < prod.length; i++) {
                        if (prod[i].getID() == productChoice) {
                            prod[i].setProductStatus(false);
                            System.out.println("Operacion Exitosa!");
                            break;
                        }

                    }
                } else {
                    System.out.println("Operacion no exitosa!");
                }


            } catch (NumberFormatException e) {
                System.out.println("Hubo un error al descontinuar el prodcuto...");
            }


        }


    }

}
