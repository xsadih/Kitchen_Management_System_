package APP.Inventory_Management.FoodItem.VegitableFood;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class TamatoClass implements vegitableItem{
    Scanner input51=new Scanner(System.in);
    ArrayList<String> tamatoList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void add() {
        System.out.println("Please Enter the tamato in Kg ");
        Double tamatoNoKg= input51.nextDouble();//Enter Amount in Kg
        int tamatoNoPiece= (int) (tamatoNoKg*10);//Each Kg Contain 10 is standard rate
        for(int i=0;i<=tamatoNoPiece-1;i++)
        {
            tamatoList.add("tamato");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the tamato in No of pieces  which you required  Note: Each Kg has 10 pieces");
        int tamatoNoPiece= input51.nextInt();
        if (tamatoList.size()!=0 && tamatoList.size()>=tamatoNoPiece) {
            for (int i = 0; i <= tamatoNoPiece - 1; i++) {
                tamatoList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Tamato in Stock kindly add some tamato in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stocck() {
        int amountinPieces=tamatoList.size();
        Double amountinKg= (double) (amountinPieces/10);
        System.out.println("The Amount of tamato in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
