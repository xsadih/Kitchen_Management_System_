package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class TeaClass implements MasalaInterface{

    Scanner input35=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> teaList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the tea in Kg ");
        Double teaNoKg= input35.nextDouble();//Enter Amount in Kg
        int teaNoTeaSpoon= (int) (teaNoKg*384);//Each Kg Contain 384 Teaspoon of tea standard rate
        for(int i=0;i<=teaNoTeaSpoon-1;i++)
        {
            teaList.add("tea");
        }
        itemop.adminOperation();


    }

    @Override
    public void remove() {
        System.out.println("Please Enter the tea in tea Spoon which you required ");

        int teaNoTeaSpoon= input35.nextInt();
        if (teaList.size()!=0 && teaList.size()>teaNoTeaSpoon)
        for(int i=0;i<=teaNoTeaSpoon-1;i++)
        {
            teaList.remove(0);
        }
        else
        {
            System.out.println("There is no tea in the stock kinddlu add some tea in the stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=teaList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of tea in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
