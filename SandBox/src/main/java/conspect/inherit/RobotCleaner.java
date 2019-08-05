package conspect.inherit;

public class RobotCleaner extends Robot {

    private String name = "Shadow";


    public RobotCleaner() {
        this("Cleaner");
    }

    public RobotCleaner(String name) {
        super(name);
    }

    public void printInfo(){
        System.out.println(this.getClass().getName() + " " + name);
    }


}
