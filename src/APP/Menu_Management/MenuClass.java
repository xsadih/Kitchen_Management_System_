package APP.Menu_Management;
import APP.Menu_Management.coffee.CoffeeClass;
import APP.Menu_Management.curry.CurryClass;

import java.util.Scanner;

public class MenuClass {

    Scanner input2=new Scanner(System.in);
    MenuInterface currymenu;
    MenuInterface coffeemenu;

    public void init()
    {
        input2=new Scanner(System.in);
        currymenu=new CurryClass();
         coffeemenu=new CoffeeClass();
    }


    public  void menuCategory()
    {

        System.out.println("We Have 2 Menues ,Coffee and Curry ");
        System.out.println("press 1 to display the Curry Menu and 2 for Coffee  ");
        int menuChoice=input2.nextInt();
        switch (menuChoice)
        {
            case 1:
            {
                init();
                currymenu.getMenuinfo();
                break;
            }
            case 2:
            {
                init();
                coffeemenu.getMenuinfo();
                break;
            }

            default:
            {
                System.out.println("There is no menu against your option ");
                menuCategory();
            }
        }
    }
}
