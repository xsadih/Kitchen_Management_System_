package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class BeetrootClass implements vegitableItem{
    Scanner input40=new Scanner(System.in);
    ArrayList<String> beetrootList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the Beetroot in Kg ");
        Double beetrootNoKg= input40.nextDouble();//Enter Amount in Kg
        int beetrootNoPiece= (int) (beetrootNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=beetrootNoPiece-1;i++)
        {
            beetrootList.add("beetroot");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the Beetroot in No of pieces which you required ");
        int beetrootNoPiece= input40.nextInt();
        if(beetrootList.size()!=0 && beetrootList.size()>beetrootNoPiece) {
            for (int i = 0; i <= beetrootNoPiece - 1; i++) {
                beetrootList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no beetroot in the stock please add some beetroot in the stock ");
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=beetrootList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of Beetroot in Kg is" +amountinKg);
        itemop.adminOperation();
    }

}
