package APP.Inventory_Management;
import APP.Inventory_Management.FoodItem.FoodItem;
import APP.Inventory_Management.KitchenEquipment.KItchenEquipmentClass;
import java.util.Scanner;

public class ItemOperation implements Item{
    Scanner input53=new Scanner(System.in);
    Item foodItem;
    Item kitchenItem;
    public void init()
    {
         input53=new Scanner(System.in);
         foodItem=new FoodItem();
         kitchenItem=new KItchenEquipmentClass();
    }

    @Override
    public void addNewItem() {
        System.out.println("Please Enter the choice,Press 1 for Food Item and 2 for Kitchen Equipment ");
        int itemChoice=input53.nextInt();
        switch (itemChoice)
        {
           //1. to add food item in Stock
            case 1:
            {
                init();
                foodItem.addNewItem();
                System.out.println(" Food Item Added Successfully");
                break;
            }
            case 2:
            {
                init();
                kitchenItem.addNewItem();
                System.out.println("Kitchen Item Add Successfully");
                break;

            }
        }



    }



    @Override
    public void removeItem() {
        System.out.println("Please Enter the choice,Press 1 to remove  Food Item and 2 for Kitchen Equipment ");
        int itemChoice=input53.nextInt();
        switch (itemChoice)
        {
            //1. to add food item in Stock
            case 1:
            {

                foodItem.removeItem();
                System.out.println(" Food Item Removed Successfully");
            }
            case 2:
            {
                kitchenItem.removeItem();
                System.out.println("Kitchen Item Add Successfully");

            }
        }

    }

    @Override
    public void displayItems() {
        System.out.println("Please Enter the choice,Press 1 to see  Food Item in stock  and 2 for Kitchen Equipment in stock  ");
        int itemChoice=input53.nextInt();
        switch (itemChoice)
        {
            //1. to add food item in Stock
            case 1:
            {

                foodItem.displayItems();
                System.out.println(" Food Item Displayed  Successfully");
            }
            case 2:
            {

                kitchenItem.displayItems();
                System.out.println("Kitchen Item displayed  Successfully");

            }
        }
    }
}
