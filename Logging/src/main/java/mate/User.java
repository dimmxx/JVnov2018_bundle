package mate;

import java.util.Random;

public class User {

    private String firstName;
    private String lastName;

    public String showMeMessage() {
        return "This is some message";
    }

    public Integer giveMeASign() {
        Random random = new Random();
        return random.nextInt();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
