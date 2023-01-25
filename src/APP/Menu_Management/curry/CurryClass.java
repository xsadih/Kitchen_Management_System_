package APP.Menu_Management.curry;

import APP.Menu_Management.MenuClass;
import APP.Menu_Management.MenuInterface;
import APP.Menu_Management.curry.Daal.DaalClass;
import APP.Menu_Management.curry.karhai.KarhaiClass;

import java.util.Scanner;


public class CurryClass extends MenuClass implements MenuInterface {

   Scanner input3=new Scanner(System.in);
    CurryInterface karhai;
    CurryInterface daal;

    public void init()
    {
         input3=new Scanner(System.in);
         karhai=new KarhaiClass();
         daal=new DaalClass();
    }
    @Override
    public void getMenuinfo() {
        System.out.println("we have 2 Curry option. Daal and Karhai");
        System.out.println("Press 1 for Karhai and 2 for Daal");
        int curryOption=input3.nextInt();
        switch (curryOption)
        {
            case 1:
            {
                init();
                karhai.curryInfo();
                break;

            }
            case 2:
            {
                init();
                daal.curryInfo();
                break;
            }
            default:
            {
                System.out.println("Please Enter Select Options");
                getMenuinfo();
            }
        }
    }

    @Override
    public void getMenuRecipeInfo() {

    }
}
