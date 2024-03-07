package Inventory.models;

public class dCd extends dGeneralProd {
    private String artista;
    private int songNumber;
    private String discografica;

    public dCd(){

    }
    public dCd(int ID, String nameProduct, double price, int stockNumber, String artista, int songNumber, String discografica) {
        super(ID, nameProduct, price, stockNumber);
        this.artista = artista;
        this.songNumber = songNumber;
        this.discografica = discografica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(int songNumber) {
        this.songNumber = songNumber;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    @Override
    public String toString(){
        String estado =  isProductStatus() == true ? "Activo" :"Descatalogado";
        return   // "ID: "+ ID + " \n"+
                "Nombre del producto: "+ getNameProduct() + " \n"
                        + "Artista: " + getArtista() +"\n"
                        + "Numero de canciones: " + getSongNumber() +"\n"
                        + "Discografica: " + getDiscografica()+"\n"
                        + "Numero en existencias: "+ getStockNumber()+ " \n"
                        + "Precio: "+ getPrice() + "\n"
                        + "Valor del Stock: "+ stockValue() + " \n"
                        + "Estado del prodcuto: "+ estado + " \n";

        //
    }
}
