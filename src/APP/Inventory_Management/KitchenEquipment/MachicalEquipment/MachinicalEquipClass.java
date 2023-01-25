package APP.Inventory_Management.KitchenEquipment.MachicalEquipment;

import APP.Inventory_Management.KitchenEquipment.KItchenEquipmentClass;
import APP.Inventory_Management.KitchenEquipment.KitchenEquipmentInterface;
import java.util.Scanner;


public class MachinicalEquipClass extends KItchenEquipmentClass implements KitchenEquipmentInterface {
    Scanner input44=new Scanner(System.in);
    MachinicalEquipInterface cup;
    MachinicalEquipInterface fork;
    MachinicalEquipInterface knife;
    MachinicalEquipInterface spoon;
    MachinicalEquipInterface teaspoon;
    public void init()
    {
         input44=new Scanner(System.in);
         cup=new CupClass();
         fork=new ForkClass();
         knife=new KnifeClass();
         spoon=new SpoonClass();
         teaspoon=new TeaspoonClass();
    }
    @Override
    public void addEquip()
    {
        System.out.println("Press 1 to add Cup  press 2 to add Fork Press 3 to add Knifes press 4 to add Spoon and press 5 to add Tea Spoon ");
        int ElectricEquipOp=input44.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                cup.addMachinicalEquip();
                System.out.println("Cup Added ");
                break;
            }
            case 2:
            {

                fork.addMachinicalEquip();
                System.out.println("Fork   Added");
                break;
            }
            case 3:
            {

                knife.addMachinicalEquip();
                System.out.println("Knife  Added");
                break;
            }
            case 4:
            {

                spoon.addMachinicalEquip();
                System.out.println("Spoon  Added");
                break;
            }
            case 5:
            {

                teaspoon.addMachinicalEquip();
                System.out.println("Tea Spoon  Added");
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
        System.out.println("Press 1 to remove Cup  press 2 to remove Fork Press 3 to remove Knifes press 4 to remove Spoon and press 5 to remove Tea Spoon ");
        int ElectricEquipOp=input44.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                cup.removeMachinicalEquip();
                System.out.println("Cup removed ");
                break;
            }
            case 2:
            {

                fork.removeMachinicalEquip();
                System.out.println("Fork Removed");
                break;
            }
            case 3:
            {

                knife.removeMachinicalEquip();
                System.out.println("Knife  removed");
                break;
            }
            case 4:
            {

                spoon.removeMachinicalEquip();
                System.out.println("Spoon  removed");
                break;
            }
            case 5:
            {

                teaspoon.removeMachinicalEquip();
                System.out.println("Tea Spoon  removed");
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
        System.out.println("Press 1 to View Stock of  Cup  press 2 to View Stock of  Fork Press 3 to View Stock of  Knifes press 4 to View Stock of  Spoon and press 5 to View Stock of  Tea Spoon ");
        int ElectricEquipOp=input44.nextInt();
        switch (ElectricEquipOp)
        {
            case 1:
            {

                cup.viewMachinalEquipStock();
                System.out.println("Cup Stock Displayed successfully  ");
                break;
            }
            case 2:
            {

                fork.viewMachinalEquipStock();
                System.out.println("Fork Stock Displayed successfully ");
                break;
            }
            case 3:
            {

                knife.viewMachinalEquipStock();
                System.out.println("Knife  Stock Displayed successfully ");
                break;
            }
            case 4:
            {

                spoon.viewMachinalEquipStock();
                System.out.println("Spoon  Stock displayed successfully ");
                break;
            }
            case 5:
            {

                teaspoon.viewMachinalEquipStock();
                System.out.println("Tea Spoon  Stock Displayed successfully ");
                break;
            }
            default:
            {
                System.out.println("there is no item to View stock  against your choice");
                EquipStock();
            }
        }

    }
}
