package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class MilkClass implements otherItemInterface{
    Scanner input37=new Scanner(System.in);
    ArrayList<String> milkList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addOtherItem() {
        System.out.println("Please Enter the milk in Litter ");
        Double milkNoKg= input37.nextDouble();//Enter Amount in Litter
        int milkNoGram= (int) (milkNoKg*1000);//Each Kg Contain 1000 Mili Litter
        for(int i=0;i<=milkNoGram-1;i++)
        {
            milkList.add("milk");
        }
        itemop.adminOperation();

    }

    @Override
    public void removeOtherItem() {
        System.out.println("Please Enter the milk in No of Mili Litter which you required ");
        int milkNoPiece= input37.nextInt();
        if (milkList.size()!=0 && milkList.size()>=milkNoPiece) {
            for (int i = 0; i <= milkNoPiece - 1; i++) {
                milkList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no milk in stock please Add some milk in stock  ");
            addOtherItem();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewStock() {
        int amountinPieces=milkList.size();
        Double amountinKg= (double) (amountinPieces/1000);
        System.out.println("The Amount of milk in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
