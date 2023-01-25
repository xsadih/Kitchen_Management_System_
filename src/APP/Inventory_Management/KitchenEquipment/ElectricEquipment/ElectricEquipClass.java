package APP.Inventory_Management.KitchenEquipment.ElectricEquipment;


import APP.Inventory_Management.KitchenEquipment.KItchenEquipmentClass;
import APP.Inventory_Management.KitchenEquipment.KitchenEquipmentInterface;

import java.util.Scanner;

public class ElectricEquipClass extends KItchenEquipmentClass implements KitchenEquipmentInterface {
    Scanner input54=new Scanner(System.in);
    ElectricEquipmentInterface oven;
    ElectricEquipmentInterface refrigerator;
    ElectricEquipmentInterface stove;
    public void init()
    {
         input54=new Scanner(System.in);
         oven=new OvenClass();
         refrigerator=new RefigatorClass();
         stove=new StoveClass();
    }
    @Override
    public void addEquip()
    {
        System.out.println("Press 1 to add Oven press 2 to add Refigeratior Press 3 to add Stove");
        int ElectricEquipOp=input54.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                oven.addElectricEquip();
                System.out.println("Oven Added ");
                break;
            }
            case 2:
            {

                refrigerator.addElectricEquip();
                System.out.println("Refrigetor Added");
                break;
            }
            case 3:
            {

                stove.addElectricEquip();
                System.out.println("Stove Added");
                break;
            }
            default:
            {
                System.out.println("there is no item to add against your choice");
                addEquip();
            }
        }
    }
    @Override
    public void removeEquip()
    {
        System.out.println("Press 1 to remove Oven press 2 to add Refigeratior Press 3 to add Stove");
        int ElectricEquipOp=input54.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                oven.removeElectricEquip();
                System.out.println("Oven removed ");
                break;
            }
            case 2:
            {

                refrigerator.removeElectricEquip();
                System.out.println("Refrigetor removed");
                break;
            }
            case 3:
            {

                stove.removeElectricEquip();
                System.out.println("Stove removed");
                break;
            }
            default:
            {
                System.out.println("there is no item to add against your choice");
                removeEquip();
            }
        }

    }
    @Override
    public void EquipStock()
    {
        System.out.println("Press 1 to View Stock of  Oven press 2 to View Stock of Refigeratior Press 3 to View Stock of Stove");
        int ElectricEquipOp=input54.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                oven.viewElectricEquipStock();
                System.out.println("Oven Stocked displayed successfully  ");
                break;
            }
            case 2:
            {

                refrigerator.viewElectricEquipStock();
                System.out.println("Refrigetor Stocked displayed successfully");
                break;
            }
            case 3:
            {

                stove.viewElectricEquipStock();
                System.out.println("Stove Stocked displayed successfully");
                break;
            }
            default:
            {
                System.out.println("there is no item to Display  against your choice");
                EquipStock();
            }
        }

    }
}
