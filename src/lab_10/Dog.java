package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    private final int MAX_SPEED = 60;
    private String animalName;

    public Dog() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Dog");
    }


    @Override
    public int setSpeed(int speed) {
        return this.speed = new SecureRandom().nextInt(speed);
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

