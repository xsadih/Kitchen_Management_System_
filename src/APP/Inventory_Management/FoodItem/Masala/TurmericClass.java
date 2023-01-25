package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class TurmericClass implements MasalaInterface{
    Scanner input15=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> turmericList=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Please Enter the turmeric in Kg ");
        Double turmericNoKg= input15.nextDouble();//Enter Amount in Kg
        int turmericNoTeaSpoon= (int) (turmericNoKg*384);//Each Kg Contain 384 Teaspoon is standard rate
        for(int i=0;i<=turmericNoTeaSpoon-1;i++)
        {
            turmericList.add("turmeric");
        }
        itemop.adminOperation();

    }

    @Override
    public void remove() {
        System.out.println("Please Enter the turmeric in Tea spoon  which you required ");
        int turmericNoTeaSpoon= input15.nextInt();
        if (turmericList.size()!=0 && turmericList.size()>turmericNoTeaSpoon) {
            for (int i = 0; i <= turmericNoTeaSpoon - 1; i++) {
                turmericList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no turmeric in stock please add some Turmeric in stock ");
            add();
        }
        itemop.adminOperation();
    }

    @Override
    public void stock() {
        int amountinPieces=turmericList.size();
        Double amountinKg= (double) (amountinPieces/384);
        System.out.println("The Amount of turmeric in Kg is" +amountinKg);
        itemop.adminOperation();
    }
}
