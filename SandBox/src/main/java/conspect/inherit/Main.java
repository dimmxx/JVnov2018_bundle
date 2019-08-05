package conspect.inherit;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("Robot");
        System.out.println(robot.getName());

        RobotCleaner robotCleaner = new RobotCleaner();
        robotCleaner.setName("RobotCleaner");

        robotCleaner.printInfo();







    }



}
