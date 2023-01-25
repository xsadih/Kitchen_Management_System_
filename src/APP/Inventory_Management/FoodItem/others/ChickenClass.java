package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ChickenClass implements otherItemInterface{
    Scanner input36=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> chickenList=new ArrayList<>();
    @Override
    public void addOtherItem() {
        System.out.println("Please Enter the chicken in Kg ");
        Double chickenNoKg= input36.nextDouble();//Enter Amount in Kg
        int chickenNoGram= (int) (chickenNoKg*1000);//Each Kg Contain 1000 Gram
        for(int i=0;i<=chickenNoGram-1;i++)
        {
            chickenList.add("chicken");
        }
        itemop.adminOperation();

    }

    @Override
    public void removeOtherItem() {
        System.out.println("Please Enter the chicken in No of Gram which you required ");
        int chickenNoPiece= input36.nextInt();
        if (chickenList.size()!=0 && chickenList.size()>=chickenNoPiece) {
            for (int i = 0; i <= chickenNoPiece - 1; i++) {
                chickenList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no chicken in stock please Add some chicken in stock  ");
            addOtherItem();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewStock() {
        int amountinPieces=chickenList.size();
        Double amountinKg= (double) (amountinPieces/1000);
        System.out.println("The Amount of chicken in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
