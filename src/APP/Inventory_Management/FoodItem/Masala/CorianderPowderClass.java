package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class CorianderPowderClass  implements MasalaInterface{
    Scanner input31=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> corianderpowderList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the corianderpowder in Kg ");
        Double corianderpowderNoKg= input31.nextDouble();//Enter Amount in Kg
        int corianderpowderNoTeaSpoon= (int) (corianderpowderNoKg*384);//Each Kg Contain 384 Teaspoon is standard rate
        for(int i=0;i<=corianderpowderNoTeaSpoon-1;i++)
        {
            corianderpowderList.add("corianderpowder");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the corianderpowder in Tea Spoon  which you required ");
        int corianderpowderNoTeaSpoon= input31.nextInt();
        if(corianderpowderList.size()!=0 && corianderpowderList.size()>corianderpowderNoTeaSpoon) {
            for (int i = 0; i <= corianderpowderNoTeaSpoon - 1; i++) {
                corianderpowderList.remove(0);
            }
        }
        else {
            System.out.println("There is no corianderpowder in Stock so Add Please");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=corianderpowderList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of corianderpowder in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
