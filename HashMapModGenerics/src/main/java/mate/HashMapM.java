package mate;

public class HashMapM<K, V> {

    private int capacity;
    private Node<K, V>[] array;
    private double size;
    private int entryQuantity;
    private double loadFactor;

    public HashMapM() {
        capacity = 16;
        loadFactor = 0.75;
        array = new Node[capacity];
    }

    public HashMapM(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        array = new Node[capacity];
    }

    public boolean put(K key, V value) {
        ensureCapacity();
        Node<K, V> node = new Node(key, value);
        int index = getIndex(node.getHash(), array.length);
        if (array[index] == null) {
            array[index] = node;
            size++;
            entryQuantity++;
        } else {
            Node<K, V> nodeTemp = array[index];

            while (nodeTemp.getNext() != null){
                nodeTemp = nodeTemp.getNext();
            }

            nodeTemp.setNext(node);
            entryQuantity++;
        }
        System.out.println(node + "index = " + index);
        return true;
    }

    private int getIndex(int hash, int length) {
        if (hash == 0) {
            return 0;
        } else {
            return hash & (length - 1);
        }
    }

    private void ensureCapacity() {
        double sizeThreshold = capacity * loadFactor;
        if (size >= sizeThreshold) {
            System.out.println("Resize: " + size + "/" + sizeThreshold);
            Node<K, V>[] arrayNew = new Node[capacity *= 2];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    arrayNew[getIndex(array[i].getHash(), arrayNew.length)] = array[i];
                }
            }
            array = arrayNew;
        }
    }

    public boolean ensureCollision(Node<K, V> node) {


        return false;
    }


    public void printOutMap() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }


}
