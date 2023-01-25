package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class RedChillyClass implements MasalaInterface {
    Scanner input16=new Scanner(System.in);
    ArrayList<String> redChillyList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the redChilly in Kg ");
        Double redChillyNoKg= input16.nextDouble();//Enter Amount in Kg
        int redChillyNoTeaSpoon= (int) (redChillyNoKg*384);//Each Kg Contain 384 Teaspoon  of powder
        for(int i=0;i<=redChillyNoTeaSpoon-1;i++)
        {
            redChillyList.add("redChilly");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the redChilly in Tea Spoon which you required ");

        int redChillyNoTeaSpoon=input16.nextInt();
        if(redChillyList.size()!=0 && redChillyList.size()>redChillyNoTeaSpoon) {
            for (int i = 0; i <= redChillyNoTeaSpoon - 1; i++) {
                redChillyList.remove(0);
            }
        }
        else
        {
            System.out.println("Ther is no Red Chilly in Stock so please add some Red Chilly in Stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=redChillyList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of redChilly in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
