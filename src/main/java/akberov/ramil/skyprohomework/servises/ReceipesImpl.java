package akberov.ramil.skyprohomework.servises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReceipesImpl implements Receipes {
    Map<Long, Receipes> receipesMap = new HashMap<>();
    private static long recipeId = 1L;

    @Override
    public Receipes addReсipe(Receipes receipe) {
        receipesMap.put(recipeId, receipe);
        recipeId++;
        return receipe;
    }

    @Override
    public Receipes getRecipe(long recipeId) {
        return receipesMap.get(recipeId);
    }
}
