package JavaCollectionFrameWork.ArrayListAndLinkedList;

public class Product {
    private String productName;
    private double price;
    private int id;

    public Product( int id,String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product [id= "+ id +", productName= " + productName + ", price= " + price + "]";
    }
}
