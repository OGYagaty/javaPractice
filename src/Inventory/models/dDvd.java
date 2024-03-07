package Inventory.models;

public class dDvd extends dGeneralProd {

    private int duration;
    private String clasificationOld;
    private String studioCine;

    public dDvd() {

    }

    public dDvd(int ID, String nameProduct, double price, int stockNumber, int duration, String clasificationOld, String studioCine) {
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

    public String getClasificationOld() {
        return clasificationOld;
    }

    public void setClasificationOld(String clasificationOld) {
        this.clasificationOld = clasificationOld;
    }

    public String getStudioCine() {
        return studioCine;
    }

    public void setStudioCine(String studioCine) { this.studioCine = studioCine; }

    //metodo para valorar el stock + el 5%

    @Override
    public Double stockValue() {
        double devolutionInv = getPrice() * 0.05;
        double totalProd = devolutionInv + getPrice();
        return totalProd * getStockNumber();
    }

    @Override
    public String toString() {
        String estado = isProductStatus() == true ? "Activo" : "Descatalogado";
        return   // "ID: "+ ID + " \n"+
                "Nombre de la pelicula: " + getNameProduct() + " \n"
                        + "Duracion pelicula: " + getDuration() + " minutos \n"
                        + "Clasificacion de edad: " + getClasificationOld() + "\n"
                        + "Estudio: " + getStudioCine() + "\n"
                        + "Numero en existencias: " + getStockNumber() + " \n"
                        + "Precio de la pelicula: " + getPrice() + "\n"
                        + "Valor del Stock: " + stockValue() + " \n"
                        + "Estado de la pelicula: " + estado + " \n";

        //
    }
}
