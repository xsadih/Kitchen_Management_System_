package APP.Menu_Management.coffee;

import APP.Recipe_Management.CoffeRecipe.CoffeeRecipeClass;

public class CappuccinoClass extends CoffeeClass implements CoffeeInterface{

   int cappuccinoPrice=300;
    CoffeeRecipeClass coffeeRecipeClass=new CoffeeRecipeClass();
    @Override

    public int getPrice() {
        return cappuccinoPrice;
    }

    @Override
    public void getRecipe() {

        coffeeRecipeClass.CappucinnoCoffeeMenu();

    }

    @Override
    public String getCoffeeName() {
        return "Cappuccino Coffee";
    }
}
