package com.example;

import java.util.List;

import static com.example.constants.StringConstants.MALE;
import static com.example.constants.StringConstants.NY_ZOO;

public class LionAlex extends Lion{
    private final List<String> friends = List.of("Марти", "Глория", "Мелман");
    public LionAlex(Feline feline) throws Exception {
        super(MALE, feline);
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return NY_ZOO;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
