package Inventory.models;

public class dGeneralProd {


    private int ID;    // ID del producto
    private String nameProduct;  //  nombre del producto
    private double price;  // precio del producto
    private int stockNumber;  // numero de exitencias
    private boolean productStatus = true;

    // contructor vacio
    public dGeneralProd() {

    }

    //contructor con argumentos
    public dGeneralProd(int ID, String nameProduct, double price, int stockNumber) {
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

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Double stockValue(){
        return (getPrice()*stockNumber);
    }

    @Override
    public String toString(){
        String estado =  productStatus == true ? "Activo" :"Descatalogado";
        return   // "ID: "+ ID + " \n"+
                "Nombre del producto: "+ nameProduct + " \n"
                        + "Precio: "+ price + "\n"
                        + "Numero en existencias: "+ stockNumber+ " \n"
                        + "Valor del Stock: "+ stockValue() + " \n"
                        + "Estado del prodcuto: "+estado+ " \n";
    }

}
