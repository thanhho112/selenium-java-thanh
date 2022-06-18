package lab_07;

import java.util.*;

public class AnimalController {

    public static Animal racingWinner(List<Animal> animalList){

        animalList.sort(Comparator.comparing(Animal::getSpeed));    // Sort Custom Object by attribute in object
        return animalList.get(animalList.size()-1);
    }
}
