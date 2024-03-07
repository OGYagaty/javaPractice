package Inventory.controlers;

import Inventory.models.dCd;
import Inventory.models.dGeneralProd;


import java.util.List;

public class controlCd {

    generalMethods gm = new generalMethods();

    public void addToInventoryCD(List<dCd> cdProduct) {
        int num;

        int number = (cdProduct.size() + 1);
        do {
            num = 1;
            try {
                for (int i = 0; i < 1; i++) {
                    dCd pCd = new dCd();
                    System.out.println("CD # : " + number);
                    pCd.setID(number);
                    System.out.print("Ingrese nombre del CD: ");
                    pCd.setNameProduct(gm.scan());
                    System.out.print("Ingrese precio del CD: ");
                    double precio = Double.parseDouble(gm.scan());
                    if (precio > 0) {
                        pCd.setPrice(precio);
                        System.out.print("Ingrese numero de stock del CD: ");
                        int stock = Integer.parseInt(gm.scan());
                        if (stock > 0) {
                            pCd.setStockNumber(stock);
                            pCd.setProductStatus(true);
                            System.out.print("Ingrese el artista del CD: ");
                            String artist = gm.scan();
                            System.out.print("Ingrese el numero de canciones: ");
                            int numberSongs = Integer.parseInt(gm.scan());
                            System.out.print("Cual es la discografica del CD: ");
                            String discografica = gm.scan();
                            if (numberSongs > 0) {
                                pCd.setArtista(artist);
                                pCd.setSongNumber(numberSongs);
                                pCd.setDiscografica(discografica);
                                cdProduct.add(pCd);
                            }else{
                                System.out.println("Las canciones deben ser mayores a 0... ");
                            }


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

    public void displayProductCD(List<dCd> cdProduct) {
        if (cdProduct.size() == 0) {
            System.out.println("No hay CDs actualmente");
        } else {
            for (dCd pCd : cdProduct) {
                System.out.println("-------------------");
                System.out.println("CD ID: " + pCd.getID());
                System.out.println(pCd.toString());
                System.out.println("-------------------");

            }
        }
    }

    public void addToStockCD(List<dCd> cdProduct) {
        if (cdProduct.size() == 0) {
            System.out.println("En el momento no hay Cds... \n");
        } else {
            try {
                int chioice = gm.getNumberStockCd(cdProduct);
                for (dCd pCd : cdProduct) {
                    if (pCd.getID() == chioice) {
                        System.out.println("que cantidad vas agregar al Stock de CDs?");
                        int numberAdd = Integer.parseInt(gm.scan());
                        if (numberAdd <= 0) {
                            System.out.println("Para agregar al Stock inserte valores superiores a 0...");
                        } else {
                            pCd.setStockNumber(pCd.getStockNumber() + numberAdd);
                            System.out.println("Operacion Exitosa...");
                        }
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al modificar el Stock de CD");
            }
        }
    }


    public void deductStockCD(List<dCd> cdProduct) {
        if (cdProduct.size() == 0) {
            System.out.println("No hay Cds para mostrar en el momento!");
        } else {
            try {
                int chioice = gm.getNumberStockCd(cdProduct);
                for (dCd pCd : cdProduct) {
                    if (pCd.getID() == chioice) {
                        System.out.println("de cuanto va a ser la deduccion del Stock de Cds?");
                        int numberAdd = Integer.parseInt(gm.scan());
                        if (numberAdd <= 0) {
                            System.out.println("Inserte valores superiores a 0...");
                        } else if (pCd.getStockNumber() < numberAdd) {
                            System.out.println("el numero a reducir supera la cantidad de Stock actual");
                        } else {
                            pCd.setStockNumber(pCd.getStockNumber() - numberAdd);
                            System.out.println("Operacion Exitosa...");
                        }
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Error al deducir el stock de la Cds!");
            }
        }
    }

    public void discountProductGenCD(List<dCd> cdProduct) {
        try {
            int choiceOption;
            if (cdProduct.isEmpty()) {
                System.out.println("No hay CDs que mostrar!");
            } else {
                choiceOption = gm.getNumberStockCd(cdProduct);
                for (dCd pCd : cdProduct) {
                    if (pCd.getID() == choiceOption) {
                        System.out.println("Inserta 1 para cambiar el Status a Desacatalogado, de lo contrario pulsa cualquier numero...");
                        int changeStatus = Integer.parseInt(gm.scan());
                        if (changeStatus == 1) {
                            if (pCd.getStockNumber() > 0) {
                                System.out.println("El stock del inventario debe estar vacio!");
                                break;
                            } else {
                                pCd.setProductStatus(false);
                                System.out.println("Operacion Exitosa...");
                                break;
                            }
                        } else {
                            System.out.println("Cancelando Operacion");
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error cambiando e estatus de la Cds!...");
        }
    }
}
