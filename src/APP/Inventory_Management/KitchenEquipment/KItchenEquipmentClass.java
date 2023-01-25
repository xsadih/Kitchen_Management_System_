package APP.Inventory_Management.KitchenEquipment;
import APP.Inventory_Management.Item;
import APP.Inventory_Management.ItemOperation;
import APP.Inventory_Management.KitchenEquipment.ElectricEquipment.ElectricEquipClass;
import APP.Inventory_Management.KitchenEquipment.MachicalEquipment.MachinicalEquipClass;

import java.util.Scanner;

public class KItchenEquipmentClass extends ItemOperation implements Item {
    Scanner input58=new Scanner(System.in);
    ElectricEquipClass electric;
    MachinicalEquipClass machinic;
    public void init()
    {
         input58=new Scanner(System.in);
         electric=new ElectricEquipClass();
         machinic=new MachinicalEquipClass();
    }
    @Override
    public void addNewItem() {
        System.out.println("Please Enter 1 for Electric Equipment and 2 for Machinical Equipment");
        int EquipChoice = input58.nextInt();
        switch (EquipChoice)
        {
            case 1:
            {

                electric.addEquip();
                System.out.println("Electric Equipment ADD");
                break;
            }
            case 2:
            {
                machinic.addEquip();
                System.out.println("Mechinacal Equipment ADD");
                break;
            }
            default:
            {
                System.out.println("There is no item to add against your choice ");
                addNewItem();
            }
        }
    }

    @Override
    public void removeItem() {
        System.out.println("Please Enter 1 to remove Electric Equipment and 2 for Machinical Equipment");
        int EquipChoice = input58.nextInt();
        switch (EquipChoice)
        {
            case 1:
            {

                electric.removeEquip();
                System.out.println("Electric Equipment Removed ");
                break;
            }
            case 2:
            {

                machinic.removeEquip();
                System.out.println("Mechinical  Equipment Removed");
                break;
            }
            default:
            {
                System.out.println("There is no item to remove from stock against your choice ");
                removeItem();
            }
        }

    }

    @Override
    public void displayItems() {
        System.out.println("Please Enter 1 to view stock of  Electric Equipment and 2 to view stock of  Machinical Equipment");
        int EquipChoice = input58.nextInt();
        switch (EquipChoice)
        {
            case 1:
            {

                electric.EquipStock();
                System.out.println("Electric Equipment Stock displayed ");
                break;
            }
            case 2:
            {

                machinic.EquipStock();
                System.out.println("Mechinical  Equipment Stock displayed ");
                break;
            }
            default:
            {
                System.out.println("There is no item to display against your choice ");
                displayItems();
            }
        }
    }
}
