package Inventory.models;

public class dDvd extends dGeneralProd {

    private int duration;
    private int clasificationOld;
    private int studioCine;

    public dDvd(int ID, String nameProduct, double price, int stockNumber, int duration, int clasificationOld, int studioCine) {
        super(ID, nameProduct, price, stockNumber);
        this.duration = duration;
        this.clasificationOld = clasificationOld;
        this.studioCine = studioCine;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getClasificationOld() {
        return clasificationOld;
    }

    public void setClasificationOld(int clasificationOld) {
        this.clasificationOld = clasificationOld;
    }

    public int getStudioCine() {
        return studioCine;
    }

    public void setStudioCine(int studioCine) {
        this.studioCine = studioCine;
    }


    //metodo para valorar el stock + el 5%

    @Override
    public Double stockValue(){
        double devolutionInv = getPrice()*0.05;
        double totalProd = devolutionInv+getPrice();
        return totalProd*getStockNumber();
    }

    @Override
    public String toString(){
        String estado =  isProductStatus() == true ? "Activo" :"Descatalogado";
        return   // "ID: "+ ID + " \n"+
                "Nombre del producto: "+ getNameProduct() + " \n"
                        + "Duracion pelicula: " + getDuration() +"\n"
                        + "Clasificacion de edad: " + getClasificationOld() +"\n"
                        + "Estudio: " + getStudioCine() +"\n"
                        + "Numero en existencias: "+ getStockNumber()+ " \n"
                        + "Precio: "+ getPrice() + "\n"
                        + "Valor del Stock: "+ stockValue() + " \n"
                        + "Estado del prodcuto: "+ estado + " \n";

        //
    }
}
