package APP.Inventory_Management.FoodItem.FruitFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PineappleClass extends FruitFood implements FruitFoodInterface {
    Scanner input28=new Scanner(System.in);
    ArrayList<String> pineappleList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the pineapple in Kg ");
        Double pineappleNoKg= input28.nextDouble();//Enter Amount in Kg
        int pineappleNoPiece= (int) (pineappleNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=pineappleNoPiece-1;i++)
        {
            pineappleList.add("pineapple");
        }

        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the pineapple in No of Pieces which you required ");

        int pineappleNoPiece= input28.nextInt();
        if(pineappleList.size()!=0 && pineappleList.size()>=pineappleNoPiece) {
            for (int i = 0; i <= pineappleNoPiece - 1; i++) {
                pineappleList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no pine apple in stock please add some pineapple");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=pineappleList.size();
        Double amountinKg= (double) (amountinPieces/2);
        System.out.println("The Amount of pineapple in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
