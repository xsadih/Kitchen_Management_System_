package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class CucumberClass implements vegitableItem {
    Scanner input48=new Scanner(System.in);
    ArrayList<String> cucumberList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the cucumber in Kg ");
        Double cucumberNoKg= input48.nextDouble();//Enter Amount in Kg 
        int cucumberNoPiece= (int) (cucumberNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=cucumberNoPiece-1;i++)
        {
            cucumberList.add("cucumber");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the cucumber in No of pieces which you required ");
        int cucumberNoPiece= input48.nextInt();
        if(cucumberList.size()!=0 && cucumberList.size()>=cucumberNoPiece) {
            for (int i = 0; i <= cucumberNoPiece - 1; i++) {
                cucumberList.remove(0);
            }
        }
        else
        {
            System.out.println("Thee is no cucumber in stock please add some cucumber in the stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=cucumberList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of cucumber in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
