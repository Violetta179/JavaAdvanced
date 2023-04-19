package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestAnimalFarm {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        AnimalFarm animalFarm = new AnimalFarm(animals);
        animalFarm.addAnimal(Animal.CAT, "Бочка");
        animalFarm.addAnimal(Animal.CAW,"Алина");
        animalFarm.addAnimal(Animal.DOG);
        animalFarm.addAnimal(Animal.HORSE);
        animalFarm.addAnimal("Тролик");
        System.out.println(animalFarm.countedAnimals());
        System.out.println(animalFarm.uniqueNames());
        System.out.println(animalFarm);
    }

}
