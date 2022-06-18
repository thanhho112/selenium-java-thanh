package lab_07;

public class Tiger extends Animal {

    private final int MAX_SPEED = 100;
    private String animalName;
    private int speed;

    public Tiger() {
        this.speed = setSpeed(MAX_SPEED);
        this.animalName = setAnimalName("Tiger");
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

