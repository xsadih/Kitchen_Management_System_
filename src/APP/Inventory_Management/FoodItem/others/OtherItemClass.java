package APP.Inventory_Management.FoodItem.others;

import APP.Inventory_Management.FoodItem.FoodItem;
import APP.Inventory_Management.FoodItem.FoodItemInterface;

import java.util.Scanner;

public class OtherItemClass extends FoodItem implements FoodItemInterface {

    Scanner input39=new Scanner(System.in);
    otherItemInterface chicken;
    otherItemInterface mutton;
    otherItemInterface oil;
    otherItemInterface milk;
    public void init()
    {
         input39=new Scanner(System.in);
         chicken=new ChickenClass();
         mutton=new MuttonClass();
         oil=new OilClass();
         milk=new MilkClass();
    }


    @Override
    public void add() {
        System.out.println("Press 1 to add Chicken 2 to add Mutton 3 to add Oil and 4 to add Milk ");
        int otherItemChoice=input39.nextInt();
        switch (otherItemChoice)
        {
            case 1:
            {

                chicken.addOtherItem();
                System.out.println("Chicken Add successfully ");
            }
            case 2:
            {

                mutton.addOtherItem();
                System.out.println("Mutton Added Successfully ");
            }
            case 3:
            {

                oil.addOtherItem();
                System.out.println("Oil Added Successfully ");

            }
            case 4:
            {

                milk.addOtherItem();
                System.out.println("Milk Added Successfully ");
            }
            default:
            {
                System.out.println("We have nothing to add in the stock against your choice");
                add();
            }
        }

    }

    @Override
    public void remove() {
        System.out.println("Press 1 to Remove Chicken 2 to remove Mutton 3 to remove Oil and 4 to remove Milk ");
        int otherItemChoice=input39.nextInt();
        switch (otherItemChoice)
        {
            case 1:
            {

                chicken.removeOtherItem();
                System.out.println("Chicken Removed successfully ");
            }
            case 2:
            {

                mutton.removeOtherItem();
                System.out.println("Mutton removed Successfully ");
            }
            case 3:
            {

                oil.removeOtherItem();
                System.out.println("Oil removed Successfully ");

            }
            case 4:
            {

                milk.removeOtherItem();
                System.out.println("Milk Removed Successfully ");
            }
            default:
            {
                System.out.println("We have nothing to Remove in the stock against your choice");
                remove();

            }
        }
    }

    @Override
    public void viewStock() {
        System.out.println("Press 1 to View stock of  Chicken 2 to view Stock of  Mutton 3 to View Stock of  Oil and 4 to view stock of  Milk ");
        int otherItemChoice=input39.nextInt();
        switch (otherItemChoice)
        {
            case 1:
            {

                chicken.viewStock();
                System.out.println("Chicken Stock Displayed  successfully ");
            }
            case 2:
            {

                mutton.viewStock();
                System.out.println("Mutton Stock displayed Successfully ");
            }
            case 3:
            {

                oil.viewStock();
                System.out.println("Oil Stock Displayed Successfully ");

            }
            case 4:
            {

                milk.viewStock();
                System.out.println("Milk Stock Displayed  Successfully ");
            }
            default:
            {
                System.out.println("We have nothing to Display  in the stock against your choice");
                viewStock();

            }
        }
    }
}
