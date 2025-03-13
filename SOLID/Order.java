package SOLID;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Double> items = new ArrayList<>();

    public void addItem(double price) {
        items.add(price);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Double::doubleValue).sum();
    }
}
