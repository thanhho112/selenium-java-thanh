package lab_07;

import java.security.SecureRandom;

public class Animal {
    private String animalName;
    private int speed;

    public String getAnimalName() {
        return animalName;
    }

    public String setAnimalName(String animalName) {
        return this.animalName = animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        return this.speed = new SecureRandom().nextInt(speed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
