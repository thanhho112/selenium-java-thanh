package lab_07;

import java.security.SecureRandom;

public class Dog extends Animal {

    private final int MAX_SPEED = 60;
    private String animalName;
    private int speed;

    public Dog() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "MAX_SPEED=" + MAX_SPEED +
                ", animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}

