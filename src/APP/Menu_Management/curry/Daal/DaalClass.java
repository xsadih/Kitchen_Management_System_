package APP.Menu_Management.curry.Daal;

import APP.Inventory_Management.FoodItem.Masala.RedChillyClass;
import APP.Inventory_Management.FoodItem.Masala.TurmericClass;
import APP.Inventory_Management.FoodItem.VegitableFood.OnionClass;
import APP.Inventory_Management.FoodItem.others.DaalItemClass;
import APP.Inventory_Management.FoodItem.others.OilClass;
import APP.Menu_Management.curry.CurryClass;
import APP.Menu_Management.curry.CurryInterface;

import java.util.Scanner;


public class DaalClass extends CurryClass implements CurryInterface {
    Scanner input13=new Scanner(System.in);
    DaalInterface daalMash;
    OnionClass onion;
    OilClass oil;
    TurmericClass turmeric;
    RedChillyClass redchilly;
    DaalItemClass daal;
    DaalInterface mixDaal;
    public void init()
    {
         input13=new Scanner(System.in);
         daalMash=new DaalMashClass();
         onion=new OnionClass();
         oil=new OilClass();
         turmeric=new TurmericClass();
         redchilly=new RedChillyClass();
         daal=new DaalItemClass();
         mixDaal=new DaalMixClass();
    }
    @Override
    public void curryInfo() {
        System.out.println("We have 2 Daal Dishes Daal  Mash  and Daal Mix");
        System.out.println("Press 1 For Daal Mash 2 for Daal Mix");
        int daalChoice=input13.nextInt();
        switch (daalChoice)
        {
            case 1:
            {

                System.out.println(""+daalMash.getDaalName()+"\t"+""+daalMash.getDaalPrice()+"Per Half Kg");
                System.out.println("Press 1 to view Recipe");
                int recipeChoice=input13.nextInt();
                if (recipeChoice==1)
                {
                    daalMash.getDaalRecipe();
                    System.out.println("Please Press Y for Order");
                    char daalOrderOption=input13.next().charAt(0);
                    if(daalOrderOption=='Y'|| daalOrderOption=='y')
                    {

                        onion.remove();
                        oil.removeOtherItem();
                        turmeric.remove();
                        redchilly.remove();
                        daal.removeOtherItem();
                        System.out.println("Order Placed");

                    }
                    else
                    {
                        System.out.println("Order Not Placed ");
                    }
                }
                else
                {
                    System.out.println("Please 1 for recipe");
                }
                break;
            }
            case 2:
            {

                System.out.println(""+mixDaal.getDaalName()+"\t"+""+mixDaal.getDaalPrice()+"Per Half Kg");
                System.out.println("Press 1 to view Recipe");
                int recipeChoice=input13.nextInt();
                if (recipeChoice==1)
                {
                    mixDaal.getDaalRecipe();
                    System.out.println("Please Press Y for Order");
                    char daalOrderOption=input13.next().charAt(0);
                    if(daalOrderOption=='Y'|| daalOrderOption=='y')
                    {

                        onion.remove();
                        oil.removeOtherItem();
                        turmeric.remove();
                        redchilly.remove();
                        daal.removeOtherItem();
                        System.out.println("Order Placed");

                    }
                    else
                    {
                        System.out.println("Order Not Placed ");
                    }
                }
                else
                {
                    System.out.println("Wrong Option For Recipe ");
                }
                break;
            }
            default:
            {
                System.out.println("There is not Daal against your choice");
            }

        }
    }

    @Override
    public void getRecipeInfo() {

    }
}
