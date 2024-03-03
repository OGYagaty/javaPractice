package practicajavafundamentals.data;

public class cd extends products {
    private int artista;
    private int songNumber;
    private int discografica;


    public cd(int ID, String nameProduct, double price, int stockNumber, int artista, int songNumber, int discografica) {
        super(ID, nameProduct, price, stockNumber);
        this.artista = artista;
        this.songNumber = songNumber;
        this.discografica = discografica;
    }

    public int getArtista() {
        return artista;
    }

    public void setArtista(int artista) {
        this.artista = artista;
    }

    public int getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(int songNumber) {
        this.songNumber = songNumber;
    }

    public int getDiscografica() {
        return discografica;
    }

    public void setDiscografica(int discografica) {
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