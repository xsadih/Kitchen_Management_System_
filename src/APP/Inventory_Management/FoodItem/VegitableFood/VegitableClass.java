package APP.Inventory_Management.FoodItem.VegitableFood;
import APP.Inventory_Management.FoodItem.FoodItem;
import APP.Inventory_Management.FoodItem.FoodItemInterface;

import java.util.Scanner;

public class VegitableClass extends FoodItem implements FoodItemInterface {
    Scanner input52;
    vegitableItem potato;
    vegitableItem tamato;
    vegitableItem ginger;
    vegitableItem cucumber;
    vegitableItem coriander;
    vegitableItem beetroot;
    public void init()
    {
         input52=new Scanner(System.in);
         potato=new PotatoClass();
         tamato=new TamatoClass();
         ginger=new GingerClass();
         cucumber=new CucumberClass();
         coriander=new CorianderClass();
         beetroot=new BeetrootClass();
    }
   @Override
    public void add()
    {
        System.out.println("Please Enter 1 to ADD Potato 2 for Tamato 3 for Ginger 4 for Cucumber 5 for Coriander and 6 for beetroot ");
        int vegitableChoiceNo=input52.nextInt();
        switch (vegitableChoiceNo)
        {
            case 1:
            {

                potato.add();
                System.out.println("Potato Added in Stock");
                break;
            }
            case 2:
            {

                tamato.add();
                System.out.println("Tamato Added in Stock");
                break;
            }
            case 3:
            {

                ginger.add();
                System.out.println("Ginger Added in Stock");
                break;
            }
            case 4:
            {

                cucumber.add();
                System.out.println("Cucumber Added in Stock");
                break;
            }
            case 5:
            {

                coriander.add();
                System.out.println("Coriander Added in Stock");
                break;
            }
            case 6:
            {

                beetroot.add();
                System.out.println("Beetroot Added in Stock");
                break;
            }
            default:
            {
                System.out.println("Sorry No Item Against Your Choice");
                add();
            }

        }
    }

    @Override
    public void remove() {
        System.out.println("Please Enter 1 to remove Potato 2 for Tamato 3 for Ginger 4 for Cucumber 5 for Coriander and 6 for beetroot ");
        int vegitableChoiceNo=input52.nextInt();
        switch (vegitableChoiceNo)
        {
            case 1:
            {
                vegitableItem potato=new PotatoClass();
                potato.remove();
                System.out.println("Potato Removed from Stock");
                break;
            }
            case 2:
            {
                vegitableItem tamato=new TamatoClass();
                tamato.remove();
                System.out.println("Tamato Removed from Stock");
                break;
            }
            case 3:
            {
                vegitableItem ginger=new GingerClass();
                ginger.remove();
                System.out.println("Ginger removed from Stock");
                break;
            }
            case 4:
            {
                vegitableItem cucumber=new CucumberClass();
                cucumber.remove();
                System.out.println("Cucumber removed from Stock");
                break;
            }
            case 5:
            {
                vegitableItem coriander=new CorianderClass();
                coriander.remove();
                System.out.println("Coriander removed from Stock");
                break;
            }
            case 6:
            {
                vegitableItem beetroot=new BeetrootClass();
                beetroot.remove();
                System.out.println("Beetroot removed from Stock");
                break;
            }
            default:
            {
                System.out.println("Sorry No Item Against Your Choice");
                remove();
            }

        }
    }

    @Override
    public void viewStock() {
        System.out.println("Please Enter 1 to View  Potato in stock  2 for Tamato 3 for Ginger 4 for Cucumber 5 for Coriander and 6 for beetroot ");
        int vegitableChoiceNo=input52.nextInt();
        switch (vegitableChoiceNo)
        {
            case 1:
            {
                vegitableItem potato=new PotatoClass();
                potato.stocck();
                System.out.println("Potato  Stock displayed Successfully ");
                break;
            }
            case 2:
            {
                vegitableItem tamato=new TamatoClass();
                tamato.stocck();
                System.out.println("Tamato Stock Successfully");
                break;
            }
            case 3:
            {
                vegitableItem ginger=new GingerClass();
                ginger.stocck();
                System.out.println("Ginger  Stock displayed successfully ");
                break;
            }
            case 4:
            {
                vegitableItem cucumber=new CucumberClass();
                cucumber.stocck();
                System.out.println("Cucumber  Stock Displayed Successfully ");
                break;
            }
            case 5:
            {
                vegitableItem coriander=new CorianderClass();
                coriander.stocck();
                System.out.println("Coriander Stock Displayed  Successfully ");
                break;
            }
            case 6:
            {
                vegitableItem beetroot=new BeetrootClass();
                beetroot.stocck();
                System.out.println("Beetroot removed from Stock");
                break;
            }
            default:
            {
                System.out.println("Sorry No Item Against Your Choice");
                viewStock();
            }

        }
    }
}
