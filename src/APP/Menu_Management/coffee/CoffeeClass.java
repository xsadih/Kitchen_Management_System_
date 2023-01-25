package APP.Menu_Management.coffee;

import APP.Inventory_Management.FoodItem.Masala.CoffeeItemClass;
import APP.Inventory_Management.FoodItem.Masala.SugarClass;
import APP.Inventory_Management.FoodItem.others.MilkClass;
import APP.Menu_Management.MenuClass;
import APP.Menu_Management.MenuInterface;

import java.util.Scanner;


public class CoffeeClass extends MenuClass implements MenuInterface {
    Scanner input4=new Scanner(System.in);
    CoffeeInterface latte;
    SugarClass sugar;
    MilkClass milk;
    CoffeeItemClass coffee;
    CoffeeInterface cappucinno;
    public  void init()
    {
         input4=new Scanner(System.in);
         latte=new LatteCoffeeClass();
         sugar=new SugarClass();
         milk=new MilkClass();
         coffee=new CoffeeItemClass();
         cappucinno=new CappuccinoClass();
    }

    @Override
    public void getMenuinfo() {
        System.out.println("We have 2 type of Coffee Latte and Cappuccino");
        System.out.println("Press 1 for Latte and 2 for Cappuccino");
        int coffeeOption=input4.nextInt();
        switch (coffeeOption)
        {
            case 1:
            {

                System.out.println(""+latte.getCoffeeName()+"\t"+latte.getPrice());
                System.out.println("Please Press 1 for Recipe  ");
                int coffeeRecipeOption=input4.nextInt();
                if (coffeeRecipeOption==1)
                {
                    latte.getRecipe();
                    System.out.println("Press Y for oder");
                    char oderOption=input4.next().charAt(0);
                    if(oderOption=='Y'|| oderOption=='y')
                    {

                        sugar.remove();
                        coffee.remove();
                        milk.removeOtherItem();
                        System.out.println("Order Placed");
                    }
                    else
                    {
                        System.out.println("Order Not Placed ");
                    }
                }
                else
                {
                    System.out.println("You Select Wrong Option ");
                }
                break;
            }
            case 2:
            {

                System.out.println(""+cappucinno.getCoffeeName()+"\t"+cappucinno.getPrice());
                System.out.println("Please Press 1 for Recipe  ");
                int coffeeRecipeOption=input4.nextInt();
                if (coffeeRecipeOption==1)
                {
                    cappucinno.getRecipe();
                    System.out.println("Press Y for oder");
                    char oderOption=input4.next().charAt(0);
                    if(oderOption=='Y'|| oderOption=='y')
                    {

                        sugar.remove();
                        coffee.remove();
                        milk.removeOtherItem();
                        System.out.println("Order Placed");
                    }
                }
                else
                {
                    System.out.println("You select wrong Option  ");
                }
                break;
            }
            default:
            {
                System.out.println("Please Select Right Option");
                getMenuinfo();
            }

        }
    }

    @Override
    public void getMenuRecipeInfo() {

    }
}
