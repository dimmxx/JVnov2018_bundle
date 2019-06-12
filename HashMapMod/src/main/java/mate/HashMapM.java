package mate;

public class HashMapM {

    private Node[] array = new Node[16];
    private int size = 0;


    public boolean put (int key, String value){
        array[getIndex()] = new Node(key, value, array.length);


        return true;
    }


    private int getIndex(){
        for(int i = 0; i < array.length; i++){
            if(array[i] == null) return i;
        }
        return -1;
    }


    public int hashM(int key){
        return
    }





    public void printOutMap(){
        for(int i = 0; i < array.length; i++){
            System.out.println(i + ". " + array[i]);
        }
    }










}
