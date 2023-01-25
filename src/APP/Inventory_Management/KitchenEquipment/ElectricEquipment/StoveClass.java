package APP.Inventory_Management.KitchenEquipment.ElectricEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StoveClass implements ElectricEquipmentInterface{
    ArrayList<String> stoveList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    Scanner input57=new Scanner(System.in);
    @Override
    public void addElectricEquip() {
        System.out.println("Please Enter The Number of stove which is to be added in Stock  ");
        int stoveNumber=input57.nextInt();
        for (int i=0;i<=stoveNumber;i++)
        {
            stoveList.add("stove");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeElectricEquip()
    {
        System.out.println("Please Enter The Number ");
        int stoveNumber=input57.nextInt();
        if (stoveList.size()!=0 && stoveList.size()>=stoveNumber) {
            for (int i = 0; i <= stoveNumber; i++) {
                stoveList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no stove in stock kindly add stove in stock ");
            addElectricEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewElectricEquipStock() {
        int stockOfstove=stoveList.size();
        System.out.println("Number of stove in Stock is "+stockOfstove);
        itemop.adminOperation();
    }
}
