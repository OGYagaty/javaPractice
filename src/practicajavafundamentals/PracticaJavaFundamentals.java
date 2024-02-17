package practicajavafundamentals;

import practicajavafundamentals.products;

public class PracticaJavaFundamentals {

    public static void main(String[] args) {
        
       
        products productOne = new products();
        productOne.setID(1);
        productOne.setNameProduct("Televisor");
        productOne.setPrice(150_000.00);
        productOne.setStockNumber(5);
        System.out.println(productOne.toString());
        

        products productTwo = new products();
        productTwo.setID(2);
        productTwo.setNameProduct("Nevera");
        productTwo.setPrice(659_000.00);
        productTwo.setStockNumber(3);
        System.out.println(productTwo.toString());
       

        products productThree = new products(3, "Lavadora", 700_000.00, 4);
        System.out.println(productThree.toString());
       

        products productFour = new products(4, "Secadora", 650_000.00, 2);
        System.out.println( productFour.toString());
       

        products productFive = new products(5, "Estufa", 509_009.99, 5);
        System.out.println(productFive.toString());
        

        products productSix = new products(6, "Horno", 550_000.00, 9);
        System.out.println(productSix.toString());

    }

}
