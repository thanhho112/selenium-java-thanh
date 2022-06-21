package lab_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalWithBuilderController {

    public AnimalWithBuilder racingWinner(List<AnimalWithBuilder> animalList){

        // New list animal is created with isFlyable = false;
        List<AnimalWithBuilder> newAnimalList = new ArrayList<>();
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.isFlyable()) {
                newAnimalList.add(animal);
            }
        }
        newAnimalList.sort(Comparator.comparing(AnimalWithBuilder::getSpeed));    // Sort Custom Object by attribute in object
        return newAnimalList.get(newAnimalList.size()-1);
    }
}
