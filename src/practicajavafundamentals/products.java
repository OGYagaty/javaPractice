/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajavafundamentals;

/**
 *
 * @author OG
 */
public class products {
    
    private int ID;    // ID del producto
    private String nameProduct;  //  nombre del producto
    private double price;  // precio del producto
    private int stockNumber;  // numero de exitencias 
    
    // contructor vacio
      public products() {
    
    }

      //contructor con argumentos
    public products(int ID, String nameProduct, double price, int stockNumber) {
        this.ID = ID;
        this.nameProduct = nameProduct;
        this.price = price;
        this.stockNumber = stockNumber;
    }

    //obtiene el ID
    public int getID() {
        return ID;
    }

    // //establece o asigna un valor a la variable ID
    public void setID(int ID) {
        this.ID = ID;
    }
 
    //obtiene el nombre del producto
    public String getNameProduct() {
        return nameProduct;
    }

    //establece o asigna un valor a nombre del producto
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    
    //obtiene el precio
    public double getPrice() {
        return price;
    }

    //asigna un valor al precio
    public void setPrice(double price) {
        this.price = price;
    }

    //obtiene el numero de existencias del procuto
    public int getStockNumber() {
        return stockNumber;
    }

    //establece el numero de existencias
    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }
     
    
    @Override
    public String toString(){
      return    "ID: "+ ID + "\n"
              + "Nombre del producto: "+ nameProduct + "\n"
              + "Precio: "+ price + "\n"
              + "Numero en existencias: "+ stockNumber+ "\n";
   }
           
    
     
     
}
