package APP.Oder_Management;

import APP.Main;
import APP.Menu_Management.MenuClass;
import java.util.Scanner;


public class Order {
    Scanner input1=new Scanner(System.in);;
    MenuClass menu=new MenuClass();
    public void init()
    {
         menu=new MenuClass();

    }
    public void displayMenu()
    {

        System.out.println("Press 1 to displaym menu and 2 to go to the main menu ");
        int menuOp=input1.nextInt();
        switch (menuOp)
        {
            case 1:
            {
                menu.menuCategory();
                System.out.println("Menu Displayed Succesfully");
                break;
            }
            case 2:
            {
                Main.Operation();
                break;
            }
            default:
            {
                System.out.println("Please Select correct Option");
                displayMenu();
            }
        }


    }
}
