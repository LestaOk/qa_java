package com.example;

import java.util.List;

import static com.example.constants.StringConstants.*;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (HERBIVORE.equals(animalKind)) {
            return VEGETERIAN_FOOD_LIST;
        } else if (PREDATOR.equals(animalKind)) {
            return MEAT_FOOD_LIST;
        } else {
            throw new Exception(UNKNOWN_ANIMAL_TYPE_VALIDATION_MESAGE);
        }
    }

    public String getFamily() {
        return KNOWN_FAMILIES;
    }
}