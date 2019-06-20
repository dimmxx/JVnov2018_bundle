package mate.model;

import javax.persistence.*;

@Entity
@Table (name="heroes")
@NamedQuery(name = "heroes.getAllHeroes", query = "SELECT h from Hero h")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "level")
    private int lvl;



    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;


    //@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//@JoinColumn(name = "item_id", nullable = false)







    public Hero() {
    }

    public Hero(long id, String name, int lvl) {
        this.id = id;
        this.name = name;
        this.lvl = lvl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                '}';
    }
}
