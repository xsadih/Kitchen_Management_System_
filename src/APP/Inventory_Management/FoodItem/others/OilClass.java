package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class OilClass implements otherItemInterface{
    Scanner input15=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> oilList=new ArrayList<>();
    @Override
    public void addOtherItem() {
        System.out.println("Please Enter the oil in Litter ");
        Double oilNoKg= input15.nextDouble();//Enter Amount in Litter
        int oilNoGram= (int) (oilNoKg*1000);//Each Kg Contain 1000 Mili Litter
        for(int i=0;i<=oilNoGram-1;i++)
        {
            oilList.add("oil");
        }
        itemop.adminOperation();

    }

    @Override
    public void removeOtherItem() {
        System.out.println("Please Enter the oil in No of Mili Litter which you required ");
        int oilNoPiece= input15.nextInt();
        if (oilList.size()!=0 && oilList.size()>=oilNoPiece) {
            for (int i = 0; i <= oilNoPiece - 1; i++) {
                oilList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no oil in stock please Add some oil in stock  ");
            addOtherItem();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewStock() {
        int amountinPieces=oilList.size();
        Double amountinKg= (double) (amountinPieces/1000);
        System.out.println("The Amount of oil in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
