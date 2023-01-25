package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class MuttonClass implements otherItemInterface{
    Scanner input38=new Scanner(System.in);
    ArrayList<String> muttonList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addOtherItem() {
        System.out.println("Please Enter the mutton in Kg ");
        Double muttonNoKg= input38.nextDouble();//Enter Amount in Kg
        int muttonNoGram= (int) (muttonNoKg*1000);//Each Kg Contain 1000 Gram
        for(int i=0;i<=muttonNoGram-1;i++)
        {
            muttonList.add("mutton");
        }
        itemop.adminOperation();

    }

    @Override
    public void removeOtherItem() {
        System.out.println("Please Enter the mutton in No of Gram which you required.Note: Each Kg Contain 1000 Gram");
        int muttonNoPiece= input38.nextInt();
        if (muttonList.size()!=0 && muttonList.size()>=muttonNoPiece) {
            for (int i = 0; i <= muttonNoPiece - 1; i++) {
                muttonList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no mutton in stock please Add some mutton in stock  ");
            addOtherItem();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewStock() {
        int amountinPieces=muttonList.size();
        Double amountinKg= (double) (amountinPieces/1000);
        System.out.println("The Amount of mutton in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
