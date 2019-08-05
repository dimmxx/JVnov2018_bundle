package conspect.inherit;

public class Robot {

    private int serialNumber;
    protected String name = "NoName";

    public Robot() {
    }

    public Robot(String name) {
        this.name = name;
    }

    protected int getSerialNumber() {
        return serialNumber;
    }

    protected void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
