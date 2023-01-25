package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TeaspoonClass implements MachinicalEquipInterface{
    Scanner input46=new Scanner(System.in);
    ArrayList<String> teaspoonList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to add in Stock");
        int noOfteaspoon=input46.nextInt();
            for (int i = 0; i <= noOfteaspoon - 1; i++) {
                teaspoonList.add("teaspoon");
            }
            itemop.adminOperation();

    }

    @Override
    public void removeMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to Remove from Stock");
        int noOfteaspoon=input46.nextInt();
        if (teaspoonList.size()!=0 && teaspoonList.size()>=noOfteaspoon) {
            for (int i = 0; i <= noOfteaspoon - 1; i++) {
                teaspoonList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Tea spoon in stock please add spoon in stock ");
            addMachinicalEquip();
        }
        itemop.adminOperation();

    }

    @Override
    public void viewMachinalEquipStock() {
        int stockOfteaspoon= teaspoonList.size();
        System.out.println("Number of teaspoon in Stock is "+stockOfteaspoon);
        itemop.adminOperation();
    }
}
