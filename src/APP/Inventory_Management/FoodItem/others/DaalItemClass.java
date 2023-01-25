package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class DaalItemClass extends OtherItemClass implements otherItemInterface{
    Scanner input3917=new Scanner(System.in);
    ArrayList<String> daalList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addOtherItem() {
        System.out.println("Please Enter the daal in Kg ");
        Double daalNoKg= input39.nextDouble();//Enter Amount in Kg
        int daalNoGram= (int) (daalNoKg*1000);//Each Kg Contain 1000 Gram
        for(int i=0;i<=daalNoGram-1;i++)
        {
            daalList.add("daal");
        }
        itemop.adminOperation();

    }

    @Override
    public void removeOtherItem() {
        System.out.println("Please Enter the daal in No of Gram which you required ");
        int daalNoPiece= input3917.nextInt();
        if (daalList.size()!=0 && daalList.size()>=daalNoPiece) {
            for (int i = 0; i <= daalNoPiece - 1; i++) {
                daalList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no daal in stock please Add some daal in stock  ");
            addOtherItem();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewStock() {
        int amountinPieces=daalList.size();
        Double amountinKg= (double) (amountinPieces/1000);
        System.out.println("The Amount of daal in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
