package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class GingerClass implements vegitableItem{
    Scanner input49=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> gingerList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the ginger in Kg ");
        Double gingerNoKg= input49.nextDouble();//Enter Amount in Kg 
        int gingerNoPiece= (int) (gingerNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=gingerNoPiece-1;i++)
        {
            gingerList.add("ginger");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the ginger in pieces which you required ");
        int gingerNoPiece= input49.nextInt();
        if (gingerList.size()!=0 && gingerList.size()>=gingerNoPiece) {
            for (int i = 0; i <= gingerNoPiece - 1; i++) {
                gingerList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no ginger in stock please add some ginger in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=gingerList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of ginger in Kg is" +amountinKg);
        itemop.adminOperation();
    }

}
