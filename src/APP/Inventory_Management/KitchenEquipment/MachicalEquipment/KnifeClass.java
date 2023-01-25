package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class KnifeClass implements MachinicalEquipInterface{
    Scanner input41=new Scanner(System.in);
    ArrayList<String> knifeList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to add in Stock");
        int noOfknife=input41.nextInt();
        for (int i=0;i<=noOfknife-1;i++)
        {
            knifeList.add("knife");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to Remove from Stock");
        int noOfknife=input41.nextInt();
        if (knifeList.size()!=0 && knifeList.size()>=noOfknife) {
            for (int i = 0; i <= noOfknife - 1; i++) {
                knifeList.remove(0);
            }
        }
        else {
            System.out.println("There is no knife in stock please add knife in stock ");
            addMachinicalEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewMachinalEquipStock() {
        int stockOfknife= knifeList.size();
        System.out.println("Number of knife in Stock is "+stockOfknife);
        itemop.adminOperation();
    }
}
