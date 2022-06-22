package lab_10;

import java.util.Comparator;
import java.util.List;

public class AnimalController {

    public static Animal racingWinner(List<Animal> animalList){

        animalList.sort(Comparator.comparing(Animal::getSpeed));    // Sort Custom Object by attribute in object
        return animalList.get(animalList.size()-1);
    }
}
