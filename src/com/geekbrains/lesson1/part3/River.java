package com.geekbrains.lesson1.part3;

public class River {

    private final String name;
    private final int width;

    public River(String name, int width) {
        this.name = name;
        this.width = width;
    }

    public boolean canSwim(Waterfowl waterfowlAnimal) {
        int animalSwimLength = waterfowlAnimal.swim();
        return animalSwimLength >= this.width;
    }
}
