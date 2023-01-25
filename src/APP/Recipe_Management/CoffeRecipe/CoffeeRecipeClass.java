package APP.Recipe_Management.CoffeRecipe;

import APP.Recipe_Management.RecipeClass;

public class CoffeeRecipeClass extends RecipeClass {

    public void LatteCoffeeMenu()
    {
         super.sugarAmount=2; // Amount in teaspoon
         milkamount=200; //Amount in Milli Letter
        coffeeamount=1; //Amount in teaspoon
        System.out.println("Sugar:    "+sugarAmount+" Tea Spoon" +"\t"+"Milk Amount:    "+milkamount+" ML"+"\t"+"Coffee Amount :    "+coffeeamount+" Tea Spoon");
    }
    public void CappucinnoCoffeeMenu()
    {
        sugarAmount=2; // Amount in teaspoon
         milkamount=200; //Amount in Milli Liter
         coffeeamount=1; //Amount in teaspoon
         creamAmount=10; //amount in Milli Liter
        System.out.println("Sugar:    "+sugarAmount+" Tea Spoon" +"\t"+"Milk Amount:    "+milkamount+" ML"+"\t"+"Coffee Amount :    "+coffeeamount+" Tea Spoon"+"\t"+"Cream Amount "+creamAmount+" ML");

    }
}
