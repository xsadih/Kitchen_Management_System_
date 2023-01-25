package APP.Menu_Management.coffee;

import APP.Recipe_Management.CoffeRecipe.CoffeeRecipeClass;

public class LatteCoffeeClass extends CoffeeClass implements CoffeeInterface{

CoffeeRecipeClass latteCoffe=new CoffeeRecipeClass();
   int latteCoffeePrice=200;

    @Override
    public int getPrice() {
        return latteCoffeePrice;
    }
    @Override
    public void getRecipe() {
latteCoffe.LatteCoffeeMenu();
    }

    @Override
    public String getCoffeeName() {
        return "Latte Coffee";
    }
}
