package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private final int MAX_SPEED = 100;
    private String animalName;

    public Tiger() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Tiger");
    }

    @Override
    public int setSpeed(int speed) {
        return this.speed = new SecureRandom().nextInt(speed);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "MAX_SPEED=" + MAX_SPEED +
                ", animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}

