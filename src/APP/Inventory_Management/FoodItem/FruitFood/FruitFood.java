package APP.Inventory_Management.FoodItem.FruitFood;

import APP.Inventory_Management.FoodItem.FoodItem;
import APP.Inventory_Management.FoodItem.FoodItemInterface;

import java.util.Scanner;

public class FruitFood extends FoodItem implements FoodItemInterface{
    Scanner input26= new Scanner(System.in);
    FruitFoodInterface banana;
    FruitFoodInterface apple;
    FruitFoodInterface mango;
    FruitFoodInterface pineapple;
    FruitFoodInterface strawberry;
    FoodItem foodop;
    public void init(){
         banana=new BananaClass();
         apple=new AppleClass();
         mango=new MangoClass();
         pineapple=new PineappleClass();
         strawberry=new StrawberryClass();
         foodop=new FoodItem();
    }
    @Override
    public void add() {
        input26 = new Scanner(System.in);
        System.out.println("Pleasse Enter 1 to add Banana,2 to add Apple 3 to add Mango 4 to add PineApple 5 to Add Strawberry ");
        int fruitItemChoice=input26.nextInt();
        switch (fruitItemChoice)
        {
            case 1:
            {

                banana.add();
                System.out.println("Banana Added in Stock");
            break;
            }
            case 2:
            {

                apple.add();
                System.out.println("Apple Added in Stock");
                break;
            }
            case 3:
            {

                mango.add();
                System.out.println("mango Added in Stock");
                break;
            }
            case 4:
            {

                pineapple.add();
                System.out.println("PineApple Added in Stock");
                break;
            }
            case 5:
            {

                strawberry.add();
                System.out.println("Strawberry Added in Stock");
                break;
            }
            default:
            {
                System.out.println("Sorry There is nothing to add against your ");
                add();
            }

        }
    }

    @Override
    public void remove() {
        System.out.println("Pleasse Enter 1 to remove Banana,2 to remove Apple 3 to remove Mango 4 to remove PineApple 5 to remove Strawberry ");
        int fruitItemChoice=input26.nextInt();
        switch (fruitItemChoice)
        {
            case 1:
            {

                banana.remove();
                System.out.println("Banana removed in Stock");
                break;
            }
            case 2:
            {

                apple.remove();
                System.out.println("Apple removed in Stock");
                break;
            }
            case 3:
            {

                mango.remove();
                System.out.println("mango removed in Stock");
                break;
            }
            case 4:
            {

                pineapple.remove();
                System.out.println("PineApple removed in Stock");
                break;
            }
            case 5:
            {

                strawberry.remove();
                System.out.println("Strawberry removed in Stock");
                break;
            }
            default:
            {
                System.out.println("Sorry There is nothing to remove against your ");
                remove();
            }

        }
    }

    @Override
    public void viewStock() {
        System.out.println("Pleasse Enter 1 to View Stock of  Banana,2 to view Stock of  Apple 3 to view stock of  Mango 4 to view the stock of  PineApple 5 to view stock of  Strawberry ");
        int fruitItemChoice=input26.nextInt();
        switch (fruitItemChoice)
        {
            case 1:
            {

                banana.stock();
                System.out.println("Banana Stock displayed succussfully");
                break;
            }
            case 2:
            {

                apple.stock();
                System.out.println("Apple Stock displayed succussfully");
                break;
            }
            case 3:
            {

                mango.stock();
                System.out.println("mango Stock displayed succussfully");
                break;
            }
            case 4:
            {

                pineapple.stock();
                System.out.println("PineApple Stock displayed succussfully");
                break;
            }
            case 5:
            {

                strawberry.stock();
                System.out.println("Strawberry Stock displayed successfully");
                break;
            }
            default:
            {
                System.out.println("Sorry There is nothing to remove against your ");
                viewStock();

            }

        }
    }
}
