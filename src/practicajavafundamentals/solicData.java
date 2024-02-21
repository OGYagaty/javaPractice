package practicajavafundamentals;
import java.util.Scanner;
public class solicData {
    public static String perdirDatos(boolean estado){
        Scanner in = new Scanner(System.in);
        products productOne = new products();
        productOne.setProductStatus(estado);

        System.out.println("Digita el ID del producto: ");
        int ID = in.nextInt();
        productOne.setID(ID);
        in.nextLine();

        System.out.println("Digita el nombre del producto: ");
        String tempName = in.nextLine();
        productOne.setNameProduct(tempName);

        System.out.println("Digita el precio del producto: ");
        double tempPrice= in.nextDouble();
        productOne.setPrice(tempPrice);
        in.nextLine();

        System.out.println("Digita la cantidad del producto: ");
        int tempQty= in.nextInt();
        productOne.setStockNumber(tempQty);
        in.nextLine();
        return productOne.toString();
    }
}
