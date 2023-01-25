package APP.Inventory_Management.FoodItem.FruitFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class MangoClass extends FruitFood implements FruitFoodInterface{
    Scanner input27=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> mangoList=new ArrayList<>();
    //add Manago
    @Override
    public void add() {
        System.out.println("Please Enter the mango in Kg ");
        Double mangoNoKg= input27.nextDouble();//Enter Amount in Kg
        int mangoNoPiece= (int) (mangoNoKg*4);//Each Kg Contain 4 is standard rate
        for(int i=0;i<=mangoNoPiece-1;i++)
        {
            mangoList.add("mango");
        }

        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the mango in Pieces which you required ");

        int mangoNoPiece= input27.nextInt();
        if (mangoList.size()!=0 && mangoList.size()>=mangoNoPiece) {
            for (int i = 0; i <= mangoNoPiece - 1; i++) {
                mangoList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no mango in stock please add some mango in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=mangoList.size();
        Double amountinKg= (double) (amountinPieces/4);//because Each kg has 4 mango
        System.out.println("The Amount of mango in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
