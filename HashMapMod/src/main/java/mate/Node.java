package mate;

import java.util.Objects;

public class Node {

    private int key;
    private String value;
    private int hash;


    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        hash = calcHash(key);
    }

    public int calcHash(Integer key) {
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                ", hash=" + hash +
                '}';
    }
}
