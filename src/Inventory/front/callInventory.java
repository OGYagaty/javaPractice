package Inventory.front;

import Inventory.controlers.generalMethods;

public class callInventory {

    public void callInventory() {
        int option1;
        int option2 = -1;
        generalMethods methoGen = new generalMethods();
        callInvGeneral callInvGen = new callInvGeneral();
        callInvDvd callInvDVD = new callInvDvd();
        callInvCd callInCD = new callInvCd();

        do {
            option1 = methoGen.generalOption();
            switch (option1) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    callInvGen._callInvGeneral();
                    break;
                case 2:
                    callInCD._callInvCd();
                    break;
                case 3:
                    callInvDVD._callInvDvd();
                    break;
                default:
                    System.out.println("Opción no valida!");
                    break;
            }

        } while (option1 != -0);
    }


}
