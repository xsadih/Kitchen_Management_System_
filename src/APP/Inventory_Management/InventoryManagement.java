package APP.Inventory_Management;

import APP.Main;

import java.util.Scanner;

public class InventoryManagement  {
    Scanner input=new Scanner(System.in);
    ItemOperation itemop;
    public void init()
    {
         input=new Scanner(System.in);
         itemop=new ItemOperation();
    }


    public void adminOperation(){



        System.out.println("Hi Admin! I am here to help you. Pleaase Enter 1 to add New Item 2 to remove Item 3 to view Stock and 4 to go back to main menu  ");
        int inventoryOperationOption=input.nextInt();
        switch (inventoryOperationOption)
        {
            case 1:
            {
                init();
                itemop.addNewItem();
                System.out.println("<<<<<Congrats>>> \n Item Added");
                break;
            }
            case 2:
            {
                itemop.removeItem();

                System.out.println("<<<<<Congrats>>> \n Item Removed");
                break;
            }
            case 3:
            {

                itemop.displayItems();
                System.out.println("<<<<<Congrats>>> \n Item in Stock displayed successfully ");
                break;
            }
            case 4:
            {

            }
            default:
            {
                System.out.println("Please Select Right Option ");
                adminOperation();
            }
        }
    }

}
