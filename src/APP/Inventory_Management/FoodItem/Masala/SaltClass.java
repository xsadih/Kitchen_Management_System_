package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class SaltClass implements MasalaInterface{
    Scanner input33=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> saltList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the salt in Kg ");
        Double saltNoKg= input33.nextDouble();//Enter Amount in Kg
        int saltNoTeaSpoon= (int) (saltNoKg*384);//Each Kg Contain 384 Teaspoon is standard rate
        for(int i=0;i<=saltNoTeaSpoon-1;i++)
        {
            saltList.add("salt");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the salt in Tea Spoon  which you required ");

        int saltNoTeaSpoon = input33.nextInt();
        if (saltList.size() != 0 && saltList.size() > saltNoTeaSpoon) {
            for (int i = 0; i <= saltNoTeaSpoon - 1; i++) {
                saltList.remove(0);
            }
        } else
        {
            System.out.println("There is no Salt in stock please add salt in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=saltList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of salt in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
