package APP.Inventory_Management.KitchenEquipment.ElectricEquipment;

import APP.Inventory_Management.InventoryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class OvenClass implements ElectricEquipmentInterface{

    ArrayList<String> ovenList=new ArrayList<>();
    InventoryManagement itemop=new InventoryManagement();

    Scanner input55=new Scanner(System.in);
    @Override
    public void addElectricEquip() {
        System.out.println("Please Enter The Number of Oven which is to be added in Stock  ");
        int OvenNumber=input55.nextInt();
        for (int i=0;i<=OvenNumber;i++)
        {
            ovenList.add("Oven");
        }
        itemop.adminOperation();
    }

    @Override
    public void removeElectricEquip()
    {
        System.out.println("Please Enter The Number ");
        int OvenNumber=input55.nextInt();
        if(ovenList.size()!=0 && ovenList.size()>=OvenNumber) {
            for (int i = 0; i <= OvenNumber; i++) {
                ovenList.remove(0);
            }
        }
        else
        {
            System.out.println("There is no oven in stock please add some oven ");
            addElectricEquip();
        }
        itemop.adminOperation();
    }

    @Override
    public void viewElectricEquipStock() {
        int stockOfOven=ovenList.size();
        System.out.println("Number of Oven in Stock is "+stockOfOven);
        itemop.adminOperation();
    }


}
