package org.example;

import java.util.*;

public class AnimalFarm  {
    private final List<String> farmAnimals;
    public AnimalFarm(List<String> farmAnimals)
    {
        this.farmAnimals = farmAnimals;
    }

    public Map<Animal, Integer> countedAnimals() {
        Map<Animal, Integer> animalCount = new HashMap<>();
        for (String animalsFarmStr : farmAnimals) {
            String[] animalInfo = animalsFarmStr.split(" ");
            if (animalInfo.length != 2) {
                System.out.println("Please correct string " + animalsFarmStr + ". Incorrect input data.");
                continue;
            }
            Animal animalType;
            try {
                animalType = Animal.valueOf(animalInfo[0].toUpperCase());
            } catch (IllegalArgumentException ex) {
                System.out.println("Please correct string " + animalsFarmStr + ". Incorrect input data.");
                continue;
            }
            int count = animalCount.getOrDefault(animalType, 0);
            animalCount.put(animalType, count + 1);
        }
        return animalCount;
    }

    public Set<String> uniqueNames() {
        Set<String> uniqueNames = new HashSet<>();

        for (String animalsFarmStr : farmAnimals) {
            String[] animalData = animalsFarmStr.split(" ");
            if (animalData.length != 2) {
                System.out.println("Please correct string " + animalsFarmStr + ". Incorrect input data.");
                continue;
            }

            String animalName = animalData[1];
            uniqueNames.add(animalName);
        }
        return uniqueNames;
    }

    public void addAnimal(Animal animal, String name) {
        String farmAnimal = animal + " " + name;
        farmAnimals.add(farmAnimal);
    }

    public void addAnimal(Animal animal)
    {
        String name = "N";
        String farmAnimal = animal +" " +name;
        farmAnimals.add(farmAnimal);
    }

    public void addAnimal(String name)
    {
        Animal animal = Animal.NOT_DEFINED;
        String farmAnimal = animal + " "+name;
        farmAnimals.add(farmAnimal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String animal : farmAnimals) {
            sb.append(animal);
            sb.append("\n");
        }
        return sb.toString();
    }

}
