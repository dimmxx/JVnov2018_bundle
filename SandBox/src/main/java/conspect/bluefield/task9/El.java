package conspect.bluefield.task9;

public class El<T> {

    private T data;
    private El<T> next;

    public El(T d) {
        data = d;
    }

    public void add(T d) {
        next = new El<T>(d);

    }

//(a) **1**: <T> **2**: T d **3**: El<T>(d)
//(b) **1**: <T> **2**: <T> d **3**: El<T>(d)
//(c) **1**: <T> **2**: <T> d **3**: El(<T> d)
//(d) **1**: **2**: d **3**: El<d>(d)
//(e) **1**: <data> **2**: data d **3**: El<data>(d


}
