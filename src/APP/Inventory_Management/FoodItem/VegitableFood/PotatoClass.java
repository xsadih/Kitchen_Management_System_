package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PotatoClass implements vegitableItem{
    Scanner input50=new Scanner(System.in);
    ArrayList<String> potatoList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the potato in Kg ");
        Double potatoNoKg= input50.nextDouble();//Enter Amount in Kg 
        int potatoNoPiece= (int) (potatoNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=potatoNoPiece-1;i++)
        {
            potatoList.add("potato");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the potato in No of pieces which you required Note: Each Kg has 10 pieces");
        int potatoNoPiece= input50.nextInt();
        if(potatoList.size()!=0 && potatoList.size()>=potatoNoPiece) {
            for (int i = 0; i <= potatoNoPiece - 1; i++) {
                potatoList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no potato in stock kindly add some potato in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=potatoList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of potato in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
