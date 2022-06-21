package lab_08;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private String animalName;
    private int speed;
    private boolean isflyable;

    protected AnimalWithBuilder(Builder builder) {
        this.animalName = builder.animalName;
        this.speed = builder.speed;
        this.isflyable = builder.isflyable;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return isflyable;
    }

    //Inner class / Builder design
    public static class Builder{

        private String animalName;
        private int speed;
        private boolean isflyable = false;

        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public Builder setFlyable(boolean isflyable) {
            this.isflyable = isflyable;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "animalName='" + animalName + '\'' +
                ", speed=" + speed +
                ", flyable=" + isflyable +
                '}';
    }
}
