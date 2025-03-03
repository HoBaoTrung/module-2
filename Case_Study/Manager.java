package Case_Study;

import java.util.List;

public interface Manager<T> {
    boolean add(T data);
    boolean addAll(List<T> data);
    boolean remove();
    boolean update();
    void display();
    void sort();
    void writeCSV();
    void readCSV();
}
