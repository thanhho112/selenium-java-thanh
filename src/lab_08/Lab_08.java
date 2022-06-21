package lab_08;

import java.util.Arrays;

public class Lab_08 {
    public static void main(String[] args) {

        AnimalWithBuilderController animalWithBuilderController = new AnimalWithBuilderController();
        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();
//        builder.setAnimalName("Tiger");
//        builder.setSpeed(100);
//        builder.setFlyable(false);

        // Using Mehod Chaining to build mew object
        AnimalWithBuilder tiger = builder.setAnimalName("Tiger").setSpeed(100).setFlyable(false).build();
        AnimalWithBuilder dog = builder.setAnimalName("dog").setSpeed(100).setFlyable(false).build();
        AnimalWithBuilder lion = builder.setAnimalName("lion").setSpeed(100).setFlyable(false).build();
        AnimalWithBuilder goose = builder.setAnimalName("goose").setSpeed(100).setFlyable(true).build();
        AnimalWithBuilder angryBird = builder.setAnimalName("angryBird").setSpeed(100).setFlyable(true).build();

        System.out.println(Arrays.asList(tiger,dog,lion,goose,angryBird));

        AnimalWithBuilder winner = animalWithBuilderController.racingWinner(Arrays.asList(tiger,dog,lion,goose,angryBird));
        System.out.println("Winner is " + winner.getAnimalName() + ", with speed: " + winner.getSpeed());
    }
}
