package APP.Menu_Management.curry.karhai;

import APP.Inventory_Management.FoodItem.Masala.RedChillyClass;
import APP.Inventory_Management.FoodItem.Masala.TurmericClass;
import APP.Inventory_Management.FoodItem.VegitableFood.OnionClass;
import APP.Inventory_Management.FoodItem.others.ChickenClass;
import APP.Inventory_Management.FoodItem.others.MuttonClass;
import APP.Inventory_Management.FoodItem.others.OilClass;
import APP.Menu_Management.curry.CurryClass;
import APP.Menu_Management.curry.CurryInterface;
import java.util.Scanner;


public class KarhaiClass extends CurryClass implements CurryInterface {
    Scanner input12=new Scanner(System.in);

    KarhaiInterface chickenkarhai;
    KarhaiInterface muttonkarhai;
    OnionClass onion;
    OilClass oil=new OilClass();
    TurmericClass turmeric;
    RedChillyClass redchilly;
    ChickenClass chicken;
    MuttonClass mutton;
    public void init()
    {
         input12=new Scanner(System.in);

         chickenkarhai=new ChickenKarhaiClass();
         muttonkarhai=new ChickenKarhaiClass();
         onion=new OnionClass();
         oil=new OilClass();
         turmeric=new TurmericClass();
         redchilly=new RedChillyClass();
         chicken=new ChickenClass();
         mutton=new MuttonClass();
    }
    @Override
    public void curryInfo() {
        System.out.println("We have 2 Dishes Chicken Karhai and Mutton Karhai");
        System.out.println("Press 1 For Chicken Karhai 2 for Mutton Karhai");
        int curryChoice=input12.nextInt();
        switch (curryChoice)
        {
            case 1:
            {
                init();
                System.out.println(""+chickenkarhai.getKarhaiName()+"\t"+""+chickenkarhai.getKarhaiPrice()+"Per Half Kg");
                System.out.println("Press 1 to view Recipe");
                int recipeChoice=input12.nextInt();
                if (recipeChoice==1)
                {
                    chickenkarhai.getKarhaiRecipe();
                    System.out.println("Please Press Y for Order");
                    char chickenOrderOption=input12.next().charAt(0);
                    if(chickenOrderOption=='Y'|| chickenOrderOption=='y')
                    {

                        onion.remove();
                        oil.removeOtherItem();
                        turmeric.remove();
                        redchilly.remove();
                        chicken.removeOtherItem();
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
                init();
                System.out.println(""+muttonkarhai.getKarhaiName()+"\t"+""+muttonkarhai.getKarhaiPrice()+"Per Half Kg");
                System.out.println("Press 1 to view Recipe");
                int recipeChoice=input12.nextInt();
                if (recipeChoice==1)
                {
                    muttonkarhai.getKarhaiRecipe();
                    System.out.println("Please Press Y for Order");
                    char muttonOrderOption=input12.next().charAt(0);
                    if(muttonOrderOption=='Y'|| muttonOrderOption=='y')
                    {


                        onion.remove();
                        oil.removeOtherItem();
                        turmeric.remove();
                        redchilly.remove();
                        mutton.removeOtherItem();
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
            default:
            {
                System.out.println("There is not Curry against your choice");
            }

        }
    }

    @Override
    public void getRecipeInfo() {

    }
}
