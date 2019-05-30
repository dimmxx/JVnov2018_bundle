package academy.mate;

import org.springframework.stereotype.Service;

@Service
public class BootsOfTravel extends Item {

    private String name = "Boots Of Travel";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BootsOfTravel{" +
                "name='" + name + '\'' +
                '}';
    }
}
