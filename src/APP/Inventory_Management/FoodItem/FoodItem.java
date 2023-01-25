package APP.Inventory_Management.FoodItem;
import java.util.Scanner;

import APP.Inventory_Management.FoodItem.FruitFood.FruitFood;
import APP.Inventory_Management.FoodItem.Masala.MasalaClass;
import APP.Inventory_Management.FoodItem.VegitableFood.VegitableClass;
import APP.Inventory_Management.FoodItem.others.OtherItemClass;
import APP.Inventory_Management.Item;
import APP.Inventory_Management.ItemOperation;

public class FoodItem extends ItemOperation implements Item {
    FoodItemInterface vegitableClass;
    FoodItemInterface Masala;
    FoodItemInterface oher;
    FoodItemInterface fruit;


    Scanner inuput23=new Scanner(System.in);
    public void init()
    {
         vegitableClass=new VegitableClass();
         fruit=new FruitFood();
         Masala=new MasalaClass();
         oher=new OtherItemClass();
         inuput23=new Scanner(System.in);
    }
    public void addNewItem()
    {
        System.out.println("Please Enter the choice,Press 1 to add Vegitable , 2 for Fruit 3 for Masala and 4 for other Item   ");
        int foodItemChoice=inuput23.nextInt();
        switch (foodItemChoice)
        {
            case 1:
            {
                init();
                vegitableClass.add();
                System.out.println("Vegitable Added Successfully ");
                break;
            }
            case 2:
            {
                init();
                fruit.add();
                System.out.println("Fruit Added Successfully");
                break;

            }
            case 3:
            {
                init();
                Masala.add();
                System.out.println("Masala Added Successfully");
                break;
            }
            case 4:
            {

                oher.add();
                System.out.println("Other Item Added Successfully ");
            }
            default:
            {
                System.out.println("There is no item to add against your Choice");
                addNewItem();
            }
        }
    }



    @Override
    public void removeItem() {
        System.out.println("Please Enter the choice,Press 1 to remove  Vegitable , 2 for Fruit 3 for Masala and 4 for other item  ");
        int foodItemChoice=inuput23.nextInt();
        switch (foodItemChoice)
        {
            case 1:
            {

                vegitableClass.remove();
                System.out.println("Vegitable removed Successfully ");
                break;
            }
            case 2:
            {

                fruit.remove();
                System.out.println("Fruit removed Successfully");
                break;

            }
            case 3:
            {

                Masala.remove();
                System.out.println("Masala removed Successfully");
                break;
            }
            case 4:
            {

                oher.remove();
                System.out.println("Other Item removed Successfully");
            }
            default:
            {
                System.out.println("There is no item to add against your Choice");
                removeItem();
            }
        }

    }

    @Override
    public void displayItems() {
        System.out.println("Please Enter the choice,Press 1 to View stock of   Vegitable in st0ck  2 for Fruit 3 for Masala and 4 for other Item ");
        int foodItemChoice = inuput23.nextInt();
        switch (foodItemChoice) {
            case 1: {
                FoodItemInterface vegitableClass = new VegitableClass();
                vegitableClass.viewStock();
                System.out.println("Vegitable Stock displayed Successfully ");
                break;
            }
            case 2: {
                FoodItemInterface fruit = new FruitFood();
                fruit.viewStock();
                System.out.println("Fruit Stock displayedSuccessfully");
                break;

            }
            case 3: {
                FoodItemInterface Masala = new MasalaClass();
                Masala.viewStock();
                System.out.println("Masala Stock displayed Successfully");
                break;
            }
            case 4:
            {

                oher.viewStock();
                System.out.println("Other Item Displayed Successfully ");
            }
            default: {
                System.out.println("There is no item to add against your Choice");
                displayItems();
            }

        }
    }


}
