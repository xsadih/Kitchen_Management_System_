package APP.Inventory_Management.FoodItem.FruitFood;
import APP.Inventory_Management.InventoryManagement;

import java.util.Scanner;

import java.util.ArrayList;

public class AppleClass extends FruitFood implements FruitFoodInterface{
    Scanner input24=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> appleList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the apple in Kg ");
        Double appleNoKg= input24.nextDouble();//Enter Amount in Kg
        int appleNoPiece= (int) (appleNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=appleNoPiece-1;i++)
        {
            appleList.add("apple");
        }

        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the apple in No of pieces which you required ");
        int appleNoPiece= input24.nextInt();
        if (appleList.size()!=0 && appleList.size()>=appleNoPiece) {
            for (int i = 0; i <= appleNoPiece - 1; i++) {
                appleList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no apple in stock please Add some apple in stock  ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=appleList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of apple in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
