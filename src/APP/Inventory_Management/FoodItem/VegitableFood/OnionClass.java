package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class OnionClass implements vegitableItem{
    Scanner input14=new Scanner(System.in);
    ArrayList<String> onionList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the onion in Kg ");
        Double onionNoKg= input14.nextDouble();//Enter Amount in Kg
        int onionNoPiece= (int) (onionNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=onionNoPiece-1;i++)
        {
            onionList.add("onion");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the onion in Pieces which you required each Kg contain 10 pieces ");
        int onionNoPiece= input14.nextInt();
        if (onionList.size()!=0 && onionList.size()>=onionNoPiece) {
            for (int i = 0; i <= onionNoPiece - 1; i++) {
                onionList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Onion in the stock kindly add some onion in the stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=onionList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of onion in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
