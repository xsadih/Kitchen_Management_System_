package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class CorianderClass implements vegitableItem {

    Scanner input47=new Scanner(System.in);
    ArrayList<String> corianderList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the coriander in Kg ");
        Double corianderNoKg= input47.nextDouble();
        int corianderNoPiece= (int) (corianderNoKg*100);
        for(int i=0;i<=corianderNoPiece-1;i++)
        {
            corianderList.add("coriander");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the coriander in Piece which you required ");
        int corianderNoPiece= input47.nextInt();
        if (corianderList.size()!=0 && corianderList.size()>=corianderNoPiece) {
            for (int i = 0; i <= corianderNoPiece - 1; i++) {
                corianderList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no coriander in stock please add some coriander in the stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=corianderList.size();
        Double amountinKg= (double) (amountinPieces/100);
        System.out.println("The Amount of coriander in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
