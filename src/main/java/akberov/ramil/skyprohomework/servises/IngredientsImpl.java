package akberov.ramil.skyprohomework.servises;

import java.util.HashMap;
import java.util.Map;

public class IngredientsImpl implements Ingredients {

    Map<Long, Ingredients> ingredientsMap = new HashMap<>();
    private static long ingredientId = 1L;

    @Override
    public Ingredients addIngredients(Ingredients ingredients) {
        ingredientsMap.put(ingredientId, ingredients);
        ingredientId++;
        return ingredients;
    }

    @Override
    public Ingredients getIngredients(long ingredientId) {
       return ingredientsMap.get(ingredientId);
    }
}
