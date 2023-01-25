package APP.Menu_Management.curry.karhai;

import APP.Recipe_Management.CurryRecipe.KarhaiRecipeClass;

public class ChickenKarhaiClass extends KarhaiClass implements KarhaiInterface {
    int chickenKarhaiPrice=750;    //750 per half Kg
    @Override
    public int getKarhaiPrice() {
        return chickenKarhaiPrice ;
    }

    @Override
    public void getKarhaiRecipe() {
        KarhaiRecipeClass karhaiRecipeClass=new KarhaiRecipeClass();
        karhaiRecipeClass.chickenKarhaiRecipe();
    }

    @Override
    public String getKarhaiName() {
        return "Chicken Karhai";
    }
}
