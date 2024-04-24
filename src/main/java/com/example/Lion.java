package com.example;

import java.util.List;

import static com.example.constants.StringConstants.*;

public class Lion {

    private boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if (MALE.equals(sex)) {
            hasMane = true;
        } else if (FEMALE.equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(UNKNOWN_SEX_VALIDATION_MESSAGE);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(PREDATOR);
    }
}
