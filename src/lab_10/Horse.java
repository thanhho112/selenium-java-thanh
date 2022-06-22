package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {

    private final int MAX_SPEED = 75;
    private String animalName;

    public Horse() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Horse");
    }

    @Override
    public int setSpeed(int speed) {
        return this.speed = new SecureRandom().nextInt(speed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "MAX_SPEED=" + MAX_SPEED +
                ", animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}

