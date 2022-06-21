package lab_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalWithBuilderController {

    public AnimalWithBuilder racingWinner(List<AnimalWithBuilder> animalList){

        // New list animal is created with isFlyable = false;
        List<AnimalWithBuilder> newAnimalList = new ArrayList<>();
        List<AnimalWithBuilder> newAnimalList_unflyable = new ArrayList<>();
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.isFlyable()) {
                newAnimalList.add(animal);
            } else {
                newAnimalList_unflyable.add(animal);
            }
        }
        System.out.println("List of register animal for racing: " + newAnimalList.toString());
        System.out.println("List of audience animal: " + newAnimalList_unflyable.toString());

        // Find winner for the racing
        newAnimalList.sort(Comparator.comparing(AnimalWithBuilder::getSpeed));    // Sort Custom Object by attribute in object
        return newAnimalList.get(newAnimalList.size()-1);
    }
}
