package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;
import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class CupClass implements MachinicalEquipInterface{
    Scanner input42=new Scanner(System.in);
    ArrayList<String> cupList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to add in Stock");
        int noOfCup=input42.nextInt();
        for (int i=0;i<=noOfCup-1;i++)
        {
            cupList.add("CUP");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to Remove from Stock");
        int noOfCup=input42.nextInt();
        if (cupList.size()!=0 && cupList.size()>=noOfCup) {
            for (int i = 0; i <= noOfCup - 1; i++) {
                cupList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Cup in class please add some Cup in Stock ");
            addMachinicalEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewMachinalEquipStock() {
        int stockOfCup= cupList.size();
        System.out.println("Number of Cup in Stock is "+stockOfCup);
        itemop.adminOperation();
    }
}
