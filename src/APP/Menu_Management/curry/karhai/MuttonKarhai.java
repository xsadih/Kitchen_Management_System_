package APP.Menu_Management.curry.karhai;

import APP.Recipe_Management.CurryRecipe.KarhaiRecipeClass;

public class MuttonKarhai extends KarhaiClass implements KarhaiInterface {

    int muttonKarhaiPrice=1000;  //per half KG
    @Override
    public int getKarhaiPrice() {
        return muttonKarhaiPrice;
    }

    @Override
    public void getKarhaiRecipe() {
        KarhaiRecipeClass karhaiRecipeClass=new KarhaiRecipeClass();
        karhaiRecipeClass.muttonKarhaiRecipe();

    }

    @Override
    public String getKarhaiName() {
        return "Mutton Karhai";
    }
}
