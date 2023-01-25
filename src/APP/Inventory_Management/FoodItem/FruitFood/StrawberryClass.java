package APP.Inventory_Management.FoodItem.FruitFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class StrawberryClass extends FruitFood implements FruitFoodInterface{
    Scanner input29=new Scanner(System.in);
    ArrayList<String> strawberryList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the strawberry in Kg ");
        Double strawberryNoKg= input29.nextDouble();//Enter Amount in Kg
        int strawberryNoPiece= (int) (strawberryNoKg*50);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=strawberryNoPiece-1;i++)
        {
            strawberryList.add("strawberry");
        }
        itemop.adminOperation();
    }

    @Override
    public void remove() {
        System.out.println("Please Enter the strawberry in Pieces which you required ");
        int strawberryNoPiece= input29.nextInt();
        if(strawberryList.size()!=0 && strawberryList.size()>=strawberryNoPiece) {
            for (int i = 0; i <= strawberryNoPiece - 1; i++) {
                strawberryList.remove(0);
            }


        }
        else
        {
            System.out.println("There is no strawberry in stock please add some strawberry in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=strawberryList.size();
        Double amountinKg= (double) (amountinPieces/50);
        System.out.println("The Amount of strawberry in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
