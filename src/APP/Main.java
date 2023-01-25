package APP;

import APP.Inventory_Management.InventoryManagement;
import APP.Oder_Management.Order;

import java.util.Scanner;

public class Main {
    static Scanner  input59 =new Scanner(System.in);
    public static void Operation()
    {
        System.out.println("\t\t******Welcome to Kitchen Management System******* ");
        System.out.println("There are 4 Manager Operation ,\n 1. Place Oder \n 2. Manage Stock");
        InventoryManagement item=new InventoryManagement();
        Order order11=new Order();
        char operationOption='Y';
        do {
            System.out.println("PLease Press Y to Start Operation");
            operationOption=input59.next().charAt(0);
            System.out.println("Press 1 to Place an order and 2 to Manage Stock ");
            int operational=input59.nextInt();
            if(operational==1)
            {

                order11.displayMenu();

            }
            else if(operational==2)
            {

                item.adminOperation();
            }
            else
            {
                System.out.println("Please Select right Option");
            }

        }
        while (operationOption=='Y'&& operationOption=='y');
    }
    public static void main(String[] args) {
        Operation();

    }

}