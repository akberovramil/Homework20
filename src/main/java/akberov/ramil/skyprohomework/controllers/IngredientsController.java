package akberov.ramil.skyprohomework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {
    public Ingredients ingredients;

    public IngredientsController(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @GetMapping("/add")
    public Ingredients putIngredient(@RequestParam Ingredients ingredient) {
        return ingredients.addIngredients(ingredient);
    }

    @GetMapping("/get")
    public Ingredients showIngredient(@RequestParam long id) {
        return ingredients.getIngresients(id);
    }
}
