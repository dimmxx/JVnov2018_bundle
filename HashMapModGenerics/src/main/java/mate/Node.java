package mate;

import java.util.Objects;

public class Node <K, V>{

    private final K key;
    private V value;
    private int hash;
    private Node<K,V> next;


    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        hash = calcHash(key);
    }

//    private int calcHash(K key) {
//        int h = key.hashCode();
//        h ^= (h >>> 20) ^ (h >>> 12);
//        return h ^ (h >>> 7) ^ (h >>> 4);
//    }

        private int calcHash(K key) {

        return 4;
    }





    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                ", hash=" + hash +
                ", next=" + next +
                '}';
    }









}
