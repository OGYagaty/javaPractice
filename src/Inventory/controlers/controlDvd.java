package Inventory.controlers;

import Inventory.models.dDvd;
import Inventory.models.dGeneralProd;

import java.util.List;

public class controlDvd {
    generalMethods gm = new generalMethods();

    public void addToInventoryDVD(List<dDvd> dvdProduct) {
        int num;

        int number = (dvdProduct.size() + 1);
        do {
            num = 1;
            try {
                for (int i = 0; i < 1; i++) {
                    dDvd idDvd = new dDvd();
                    System.out.println("Pelicula # : " + number);
                    idDvd.setID(number);
                    System.out.print("Ingrese nombre de la pelicula: ");
                    idDvd.setNameProduct(gm.scan());
                    System.out.print("Ingrese precio del producto: ");
                    double precio = Double.parseDouble(gm.scan());
                    if (precio > 0) {
                        idDvd.setPrice(precio);
                        System.out.print("Ingrese numero de stock del producto: ");
                        int stock = Integer.parseInt(gm.scan());
                        if (stock > 0) {
                            idDvd.setStockNumber(stock);
                            idDvd.setProductStatus(true);
                            System.out.print("Ingrese la duracion: ");
                            int duration = Integer.parseInt(gm.scan());
                            System.out.print("Ingresa la clasificacion 1 para niños,para mayores de 18 cualquier numero: ");
                            int clasificationOld = Integer.parseInt(gm.scan());
                            boolean confirmClasification = clasificationOld == 1;
                            System.out.print("Cual es el estudio de la pelicula: ");
                            String estudio = gm.scan();
                            if (duration > 0) {
                                idDvd.setDuration(duration);
                                idDvd.setClasificationOld(confirmClasification ? "-18" : "+18");
                                idDvd.setStudioCine(estudio);
                                dvdProduct.add(idDvd);
                            }else{
                                System.out.println("Duracion debe ser mayor a 0");
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

    public void displayProductDvd(List<dDvd> dvdProduct) {
        if (dvdProduct.size() == 0) {
            System.out.println("No hay peliculas actualmente");
        } else {
            for (dDvd pDvd : dvdProduct) {
                System.out.println("-------------------");
                System.out.println("Producto ID: " + pDvd.getID());
                System.out.println(pDvd.toString());
                System.out.println("-------------------");

            }
        }
    }

    public void addToStockDvd(List<dDvd> dvdProduct) {
        if (dvdProduct.size() == 0) {
            System.out.println("En el momento no hay Peliculas... \n");
        } else {
            try {
                int chioice = gm.getNumberStockDvd(dvdProduct);
                for (dDvd pDvd : dvdProduct) {
                    if (pDvd.getID() == chioice) {
                        System.out.println("que cantidad vas agregar al Stock de peliculas?");
                        int numberAdd = Integer.parseInt(gm.scan());
                        if (numberAdd <= 0) {
                            System.out.println("Para agregar al Stock inserte valores superiores a 0...");
                        } else {
                            pDvd.setStockNumber(pDvd.getStockNumber() + numberAdd);
                            System.out.println("Operacion Exitosa...");
                        }
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al modificar el Stock de peliculas");
            }
        }
    }


    public void deductStockDvd(List<dDvd> dvdProduct) {
        if (dvdProduct.size() == 0) {
            System.out.println("No hay peliculas para mostrar en el momento!");
        } else {
            try {
                int chioice = gm.getNumberStockDvd(dvdProduct);

                for (dDvd pDvd : dvdProduct) {
                    if (pDvd.getID() == chioice) {
                        System.out.println("de cuanto va a ser la deduccion del Stock de peliculas?");
                        int numberAdd = Integer.parseInt(gm.scan());
                        if (numberAdd <= 0) {
                            System.out.println("Inserte valores superiores a 0...");
                        } else if (pDvd.getStockNumber() < numberAdd) {
                            System.out.println("el numero a reducir supera la cantidad de Stock actual");
                        } else {
                            pDvd.setStockNumber(pDvd.getStockNumber() - numberAdd);
                            System.out.println("Operacion Exitosa...");
                        }
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Error al deducir el stock de la pelicula!");
            }
        }
    }

    public void discountProductGenDvd(List<dDvd> dvdProduct) {
        try {
            int choiceOption;
            if (dvdProduct.isEmpty()) {
                System.out.println("No hay peliculas que mostrar!");
            } else {
                choiceOption = gm.getNumberStockDvd(dvdProduct);
                for (dDvd pDvd : dvdProduct) {
                    if (pDvd.getID() == choiceOption) {
                        System.out.println("Inserta 1 para cambiar el Status a Desacatalogado, de lo contrario pulsa cualquier numero...");
                        int changeStatus = Integer.parseInt(gm.scan());
                        if (changeStatus == 1) {
                            if (pDvd.getStockNumber() > 0) {
                                System.out.println("El stock del inventario debe estar vacio!");
                                break;
                            } else {
                                pDvd.setProductStatus(false);
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
            System.out.println("Error cambiando e estatus de la peliculas!...");
        }
    }


}
