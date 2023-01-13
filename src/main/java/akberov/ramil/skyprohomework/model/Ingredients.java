package akberov.ramil.skyprohomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor


public class Ingredients {
    @NonNull
    private String name;
    @NonNull
    private int numberOfIngredients;
    @NonNull
    private String amount;


}
