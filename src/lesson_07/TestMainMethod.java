package lesson_07;

import java.util.Arrays;

public class TestMainMethod {

    public static void main(String[] args) {

        RobotCat batteryRobotCat = new BatteryRobotCat(); //IS-A Relationship
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat windRobotCat = new WindRobotCat();

        RobotCatController robotCatController = new RobotCatController();
        robotCatController.chargeRobot((Arrays.asList(batteryRobotCat, solarRobotCat, windRobotCat)));
    }
}
