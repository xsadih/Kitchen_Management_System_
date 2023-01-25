package APP.Inventory_Management.KitchenEquipment.ElectricEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class RefigatorClass implements ElectricEquipmentInterface{  
    
    ArrayList<String> refigratorList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();
    Scanner input56=new Scanner(System.in);
    @Override
    public void addElectricEquip() {
        System.out.println("Please Enter The Number of refigrator which is to be added in Stock  ");
        int refigratorNumber=input56.nextInt();
        for (int i=0;i<=refigratorNumber;i++)
        {
            refigratorList.add("refigrator");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeElectricEquip()
    {
        System.out.println("Please Enter The Number ");
        int refigratorNumber=input56.nextInt();
        if (refigratorList.size()!=0 && refigratorList.size()>=refigratorNumber) {
            for (int i = 0; i <= refigratorNumber; i++) {
                refigratorList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no refigrator in stock please add refigrator in stock ");
            addElectricEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewElectricEquipStock() {
        int stockOfrefigrator=refigratorList.size();
        System.out.println("Number of refigrator in Stock is "+stockOfrefigrator);
        itemop.adminOperation();
    }
}
