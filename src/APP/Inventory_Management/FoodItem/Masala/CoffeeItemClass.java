package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeItemClass implements MasalaInterface{

    Scanner input30=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> coffeeList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the coffee in Kg ");
        Double coffeeNoKg= input30.nextDouble();//Enter Amount in Kg
        int coffeeNoteaSpoon= (int) (coffeeNoKg*384);//Each Kg Contain 384 Teaspoon of coffee standard rate
        for(int i=0;i<=coffeeNoteaSpoon-1;i++)
        {
            coffeeList.add("coffee");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the coffee in Tea Spoon  which you required ");
        int coffeeNoteaSpoon= input30.nextInt();
        if(coffeeList.size()!=0 && coffeeList.size()>coffeeNoteaSpoon)
        {
        for(int i=0;i<=coffeeNoteaSpoon-1;i++)
        {
            coffeeList.remove(0);
        }
        }
        else
        {
            System.out.println("There is no Coffee in Stock so Please Add Coffee in Stock");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=coffeeList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of coffee in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
