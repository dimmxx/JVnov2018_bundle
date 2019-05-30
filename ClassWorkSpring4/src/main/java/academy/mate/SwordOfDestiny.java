package academy.mate;

import org.springframework.stereotype.Service;

@Service
public class SwordOfDestiny extends Item {

    private String name = "Sword Of Destiny";

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
        return "SwordOfDestiny{" +
                "name='" + name + '\'' +
                '}';
    }
}
