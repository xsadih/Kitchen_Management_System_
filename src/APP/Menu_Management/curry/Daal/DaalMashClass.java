package APP.Menu_Management.curry.Daal;

import APP.Recipe_Management.CurryRecipe.DaalRecipeClass;

public class DaalMashClass extends DaalClass implements DaalInterface{
    int daalMashPrice=150; //daal mash per plate price
    @Override
    public int getDaalPrice() {
        return daalMashPrice;
    }

    @Override
    public String getDaalName() {
        return "Daal  Maash";
    }

    @Override
    public void getDaalRecipe() {
        DaalRecipeClass daalmash=new DaalRecipeClass();
        daalmash.daalmashRecipe();


    }
}
