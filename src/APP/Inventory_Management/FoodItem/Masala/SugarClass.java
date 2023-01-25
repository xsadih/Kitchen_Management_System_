package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class SugarClass implements MasalaInterface{
    Scanner input34=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> sugarList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the sugar in Kg ");
        Double sugarNoKg= input34.nextDouble();//Enter Amount in Kg
        int sugarNoTeaSpoon= (int) (sugarNoKg*240);//Each Kg Contain 240 Teaspoon of sugar standard rate
        for(int i=0;i<=sugarNoTeaSpoon-1;i++)
        {
            sugarList.add("sugar");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the sugar in Tea Spoon  which you required ");

        int sugarNoTeaSpoon= input34.nextInt();
        if (sugarList.size()!=0 && sugarList.size()>sugarNoTeaSpoon) {
            for (int i = 0; i <= sugarNoTeaSpoon - 1; i++) {
                sugarList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no sugar in stock please add sugar in stock");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=sugarList.size();
        Double amountinKg= (double) (amountinPieces/240);
        System.out.println("The Amount of sugar in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
