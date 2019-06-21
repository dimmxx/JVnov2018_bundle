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
        } else processChain(node, index);
        return true;
    }


    private void processChain(Node<K, V> node, int index){

        Node<K, V> nodeTemp = array[index];
        int chainLength = 0;
        do{
            chainLength++;
            nodeTemp = nodeTemp.getNext();
        }while (nodeTemp != null);
        nodeTemp = array[index];
        for (int i = 0; i < chainLength; i++){
            if(nodeTemp.getKey().equals(node.getKey())){
                nodeTemp.setValue(node.getValue());
                break;
            }
            if(i == chainLength - 1){
                nodeTemp.setNext(node);
                break;
            }
            nodeTemp = nodeTemp.getNext();
        }
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
