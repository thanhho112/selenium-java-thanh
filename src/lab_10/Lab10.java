package lab_10;

import java.util.Arrays;

public class Lab10 {

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal horse = new Horse();

        System.out.println(Arrays.asList(tiger, dog, horse));

        Animal winner = AnimalController.racingWinner(Arrays.asList(tiger, dog, horse));
        System.out.println(AnimalController.racingWinner(Arrays.asList(tiger, dog, horse)));
        System.out.println("Winner is " + winner.getAnimalName() + ", with speed: " + winner.getSpeed());

    }
}
