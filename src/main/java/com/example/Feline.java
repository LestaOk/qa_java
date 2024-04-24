package com.example;

import java.util.List;

import static com.example.constants.StringConstants.PREDATOR;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(PREDATOR);
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
