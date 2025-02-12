package JavaCollectionFrameWork.ArrayListAndLinkedList;

import java.util.*;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
//        products = new ArrayList<>();
        products = new LinkedList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product findProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void editProductById(int id, String name, double price) {
        Product p = findProductById(id);
        if (p != null) {
            p.setProductName(name);
            p.setPrice(price);
        } else System.out.println("Product not found");
    }

    public void removeProductById(int id) {
        if (findProductById(id) != null) {
            products.remove(findProductById(id));
        } else System.out.println("Product not found");
    }

    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void displayProductsByName(String name) {
        for (Product p : products) {
            if (p.getProductName().equals(name)) {
                System.out.println(p);
            }
        }
    }

    public void increaseProductByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void decreaseProductByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
