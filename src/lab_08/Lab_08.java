package lab_08;

//import lab_07.Animal;

public class Lab_08 {
    public static void main(String[] args) {

        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();
        builder.setAnimalName("Tiger");
        builder.setSpeed(100);
        builder.setFlyable(false);

        AnimalWithBuilder tiger1 = builder.setAnimalName("Tiger").setSpeed(100).setFlyable(false).build();
        AnimalWithBuilder bird1 = builder.setAnimalName("Bird").setSpeed(100).setFlyable(true).build();

        System.out.println(tiger1);
        System.out.println(bird1);

    }
}
