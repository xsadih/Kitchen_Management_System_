package APP.Inventory_Management.FoodItem.Masala;

import APP.Inventory_Management.FoodItem.FoodItem;
import APP.Inventory_Management.FoodItem.FoodItemInterface;
import java.util.Scanner;


public class MasalaClass extends FoodItem implements FoodItemInterface {

    Scanner input32=new Scanner(System.in);;
    MasalaInterface redchilly;
    MasalaInterface salt;
    MasalaInterface sugar;
    MasalaInterface tea;
    MasalaInterface corianderpowder;
    MasalaInterface Turmeric;
    public void init()
    {
         input32=new Scanner(System.in);
         redchilly=new RedChillyClass();
         salt=new SaltClass();
         sugar=new SugarClass();
         tea=new TeaClass();
         corianderpowder=new CorianderPowderClass();
         Turmeric=new TurmericClass();

    }

    @Override
    public void add() {
        System.out.println("Please Press 1 to add Red Chilly,2 to Add Salt,3 to add sugar 4 to add tea ,5 to add CorianderPowder and 6 to Add Turmeric ");
        int masalaChoice=input32.nextInt();
        switch (masalaChoice)
        {
            case 1:
            {

                redchilly.add();
                System.out.println("Red Chilly Add to Stock");
                break;

            }
            case 2:
            {

                salt.add();
                System.out.println("Salt Add to Stock");
                break;

            }
            case 3:
            {

                sugar.add();
                System.out.println("Sugar Add to Stock");
                break;

            }
            case 4:
            {

                tea.add();
                System.out.println("Tea Add to Stock");
                break;

            }
            case 5:
            {

                corianderpowder.add();
                System.out.println("Coriander Powder Add to Stock");
                break;

            }
            case 6:
            {

                Turmeric.add();
                System.out.println("Turmeric Add to Stock");
                break;

            }
            default:{
                System.out.println("Sorry There is no item to add against your choice");
                add();
            }



        }
    }

    @Override
    public void remove() {
        System.out.println("Please Press 1 to remove Red Chilly,2 to remove Salt,3 to remove sugar 4 to remove tea ,5 to remove CorianderPowder and 6 to remove Turmeric ");
        int masalaChoice=input32.nextInt();
        switch (masalaChoice)
        {
            case 1:
            {

                redchilly.remove();
                System.out.println("Red Chilly remove to Stock");
                break;

            }
            case 2:
            {

                salt.remove();
                System.out.println("Salt remove to Stock");
                break;

            }
            case 3:
            {

                sugar.remove();
                System.out.println("Sugar remove to Stock");
                break;

            }
            case 4:
            {

                tea.remove();
                System.out.println("Tea remove to Stock");
                break;

            }
            case 5:
            {

                corianderpowder.remove();
                System.out.println("Coriander Powder remove to Stock");
                break;

            }
            case 6:
            {

                Turmeric.remove();
                System.out.println("Turmeric remove to Stock");
                break;

            }
            default:{
                System.out.println("Sorry There is no item to add against your choice");
                remove();
            }



        }
    }

    @Override
    public void viewStock() {
        System.out.println("Please Press 1 to View stock of  Red Chilly,2 to View stock of Salt,3 to View stock of sugar 4 to View stock of tea ,5 to View stock of CorianderPowder and 6 to View stock of Turmeric ");
        int masalaChoice=input32.nextInt();
        switch (masalaChoice)
        {
            case 1:
            {

                redchilly.stock();
                System.out.println("Red Chilly  Stock Displayed successfully ");
                break;

            }
            case 2:
            {

                salt.stock();
                System.out.println("Salt Stock Displayed successfully");
                break;

            }
            case 3:
            {

                sugar.stock();
                System.out.println("Sugar Stock Displayed successfully");
                break;

            }
            case 4:
            {

                tea.stock();
                System.out.println("Tea rStock Displayed successfully");
                break;

            }
            case 5:
            {

                corianderpowder.stock();
                System.out.println("Coriander Powder Stock Displayed successfully");
                break;

            }
            case 6:
            {

                Turmeric.stock();
                System.out.println("Turmeric Stock Displayed successfully");
                break;

            }
            default:{
                System.out.println("Sorry There is no item to Display stock  against your choice");
                viewStock();
            }



        }
    }
}
