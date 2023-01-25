package APP.Menu_Management.curry.Daal;

import APP.Recipe_Management.CurryRecipe.DaalRecipeClass;

public class DaalMixClass extends DaalClass implements DaalInterface{
    int mixdaalPrice=150;
    @Override
    public int getDaalPrice() {
        return mixdaalPrice;
    }

    @Override
    public String getDaalName() {
        return "Mix Daal";
    }

    @Override
    public void getDaalRecipe() {
        DaalRecipeClass daalmix=new DaalRecipeClass();
        daalmix.daalMixRecipe();
    }
}
