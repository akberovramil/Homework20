package akberov.ramil.skyprohomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor

public class Receipes {
    @NonNull
    private String name;
    @NonNull
    private int cookingTime;
    @NonNull
    private List<Ingredients> ingredients = new ArrayList<>();
    @NonNull
    private List<String> steps = new ArrayList<>();





}
