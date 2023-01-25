package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ForkClass implements MachinicalEquipInterface{
    Scanner input43=new Scanner(System.in);
    ArrayList<String> forkList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    @Override
    public void addMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to add in Stock");
        int noOffork=input43.nextInt();
        for (int i=0;i<=noOffork-1;i++)
        {
            forkList.add("fork");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeMachinicalEquip() {
        System.out.println("Please Enter the number of Item want to Remove from Stock");
        int noOffork=input43.nextInt();
        if(forkList.size()!=0 && forkList.size()>=noOffork) {
            for (int i = 0; i <= noOffork - 1; i++) {
                forkList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no Fork in stock please add fork in stock ");
            addMachinicalEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewMachinalEquipStock() {
        int stockOffork= forkList.size();
        System.out.println("Number of fork in Stock is "+stockOffork);
        itemop.adminOperation();
    }
}
