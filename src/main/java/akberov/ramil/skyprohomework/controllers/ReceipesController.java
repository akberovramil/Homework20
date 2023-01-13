package akberov.ramil.skyprohomework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipes")
public class ReceipesController {

    public Receipes receipes;

    public ReceipesController(Receipes receipes) {
        this.receipes = receipes;
    }

    @GetMapping("/add")
    public Receipes putReceipes(@RequestParam Receipes receipe) {
        return receipes.addReceipes(receipe);
    }

    @GetMapping("/get")
    public Receipes showReceipe(@RequestParam long id) {
        return receipes.getRecipe(id);
    }



}
