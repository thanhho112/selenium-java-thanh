package lab_07;

public class Horse extends Animal {

    private final int MAX_SPEED = 75;
    private String animalName;
    private int speed;

    public Horse() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Horse");
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

