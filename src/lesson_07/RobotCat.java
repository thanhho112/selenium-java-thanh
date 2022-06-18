package lesson_07;

public class RobotCat {

    private String name;
    private String productionDate;

    public RobotCat(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String charge() {
        return "Charge ";
    }
}
