package Inventory.controlers;

import Inventory.models.dGeneralProd;

import java.util.List;

public class controlGeneralProducts {

    generalMethods gm = new generalMethods();

    public void addToInventoryGp(List<dGeneralProd> generalProd) {
        int num;

        int number = (generalProd.size() + 1);
        do {
            num = 1;
            try {
                for (int i = 0; i < 1; i++) {
                    dGeneralProd idGn = new dGeneralProd();
                    System.out.println("Producto: " + number);
                    idGn.setID(number);
                    System.out.print("Ingrese nombre del producto: ");
                    idGn.setNameProduct(gm.scan());
                    System.out.print("Ingrese precio del producto: ");
                    double precio = Double.parseDouble(gm.scan());
                    if (precio > 0) {
                        idGn.setPrice(precio);
                        System.out.print("Ingrese numero de stock del producto: ");
                        int stock = Integer.parseInt(gm.scan());
                        if (stock > 0) {
                            idGn.setStockNumber(stock);
                            idGn.setProductStatus(true);
                            generalProd.add(idGn);
                        } else {
                            System.out.println("Stock debe ser mayor a 0...");
                        }
                    } else {
                        System.out.println("El precio debe ser mayor a 0...");
                    }


                }
            } catch (NumberFormatException e) {
                System.out.println("Error al leer los datos...");
                System.out.println(e);
                num = 2;
            }

        } while (num != 1);
    }

    public void displayProduct(List<dGeneralProd> generalProd) {
        if (generalProd.size() == 0) {
            System.out.println("No hay datos actualmente");
        } else {
            for (dGeneralProd gn : generalProd) {
                System.out.println("-------------------");
                System.out.println("Producto ID: " + gn.getID());
                System.out.println(gn.toString());
                System.out.println("-------------------");

            }
        }
     }

    public void addToStock(List<dGeneralProd> generalProd) {
        if (generalProd.size() == 0) {
            System.out.println("En el momento no hay productos... \n");
        } else {
            try {
                int chioice = gm.getNumberStock(generalProd);
                for (dGeneralProd gn : generalProd) {
                    if (gn.getID() == chioice) {
                        System.out.println("que cantidad vas agregar al Stock?");
                      int numberAdd = Integer.parseInt(gm.scan());
                      if(numberAdd<=0){
                          System.out.println("Para agregar al Stock inserte valores superiores a 0...");
                      }
                      else {
                         gn.setStockNumber(gn.getStockNumber()+numberAdd);
                          System.out.println("Operacion Exitosa...");
                      }
                      break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al modificar el Stock");
            }
        }
    }


    public void deductStock(List<dGeneralProd> generalProd){
        if (generalProd.size() == 0){
            System.out.println("No hay productos para mostrar en el momento!");
        }else{
            try {
                int chioice = gm.getNumberStock(generalProd);

                for (dGeneralProd gn : generalProd) {
                    if (gn.getID() == chioice) {
                        System.out.println("de cuanto va a ser la deduccion del Stock?");
                        int numberAdd = Integer.parseInt(gm.scan());
                        if(numberAdd<=0){
                            System.out.println("Para agregar al Stock inserte valores superiores a 0...");
                        } else if (gn.getStockNumber() < numberAdd ){
                            System.out.println("el numero a reducir supera la cantidad de Stock actual");
                        }
                        else {
                            gn.setStockNumber(gn.getStockNumber()-numberAdd);
                            System.out.println("Operacion Exitosa...");
                        }
                        break;
                    }
                }

            }catch (NumberFormatException e){
                System.out.println("Error al deducir el stock!");
            }
        }
    }


}
