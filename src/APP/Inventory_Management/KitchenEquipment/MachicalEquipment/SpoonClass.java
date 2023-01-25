package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class SpoonClass implements MachinicalEquipInterface{
    Scanner input45=new Scanner(System.in);
    InventoryManagement itemop=new InventoryManagement();
    ArrayList<String> spoonList=new ArrayList<>();
    @Override
    public void addMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to add in Stock");
        int noOfspoon=input45.nextInt();
        for (int i=0;i<=noOfspoon-1;i++)
        {
            spoonList.add("spoon");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to Remove from Stock");
        int noOfspoon=input45.nextInt();
        if (spoonList.size()!=0 && spoonList.size()>=noOfspoon) {
            for (int i = 0; i <= noOfspoon - 1; i++) {
                spoonList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Spoon in stock please add Spoon in stock ");
            addMachinicalEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewMachinalEquipStock() {
        int stockOfspoon= spoonList.size();
        System.out.println("Number of spoon in Stock is "+stockOfspoon);
    itemop.adminOperation();
    }
}
