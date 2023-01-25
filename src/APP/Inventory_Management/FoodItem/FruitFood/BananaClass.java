package APP.Inventory_Management.FoodItem.FruitFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class BananaClass extends FruitFood implements FruitFoodInterface {
    Scanner input25=new Scanner(System.in);
    //add Banana
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> bananaList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the banana in Dozen ");
        Double bananaNoDozen= input25.nextDouble();//Enter Amount in Dozen
        int bananaNoPiece= (int) (bananaNoDozen*12);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=bananaNoPiece-1;i++)
        {
            bananaList.add("banana");
        }

        itemop.adminOperation();

    }
    //remove Banana

    @Override
    public void remove() {
        System.out.println("Please Enter the banana in Pieces  which you required ");

        int bananaNoPiece= input25.nextInt();
        if(bananaList.size()!=0 && bananaList.size()>=bananaNoPiece) {
            for (int i = 0; i <= bananaNoPiece - 1; i++) {
                bananaList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no banana in stock please add some banana in stock");
            add();
        }
        itemop.adminOperation();
    }
    //stock of Banana
    @Override
    public void stock() {
        int amountinPieces=bananaList.size();
        Double amountinKg= (double) (amountinPieces/12);
        System.out.println("The Amount of banana in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
