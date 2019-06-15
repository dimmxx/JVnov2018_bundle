package mate;

public class HashMapM {

    private int capacity;
    private Node[] array;
    private double size;
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

    public boolean put(int key, String value) {
        ensureCapacity();
        Node node = new Node(key, value);
        int index = getIndex(node.getHash(), array.length);
        array[index] = node;
        size++;
        System.out.println(node);
        return true;
    }

    private int getIndex(int hash, int length) {
        if(hash == 0){
            return 0;
        } else{
            return hash & (length - 1);
        }
    }

    private void ensureCapacity() {
        double sizeThreshold = capacity * loadFactor;
        if (size >= sizeThreshold) {
            System.out.println("Resize: " + size + "/" + sizeThreshold);
            Node[] arrayNew = new Node[capacity * 2];

            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    arrayNew[getIndex(array[i].getHash(), arrayNew.length)] = array[i];
                }
            }
            array = arrayNew;
        }
    }

    public void printOutMap() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }


}
