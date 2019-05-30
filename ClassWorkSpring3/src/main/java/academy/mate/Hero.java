package academy.mate;

import org.springframework.stereotype.Service;

@Service
public class Hero {

    private String name;
    private Item item;

    public Hero() {
    }

    public Hero(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", item=" + item +
                '}';
    }
}
