package lab_10;

import java.security.SecureRandom;

public abstract class Animal {
    private String animalName;
    protected int speed;

    public String getAnimalName() {
        return animalName;
    }

    public String setAnimalName(String animalName) {
        return this.animalName = animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract int setSpeed(int speed);

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
