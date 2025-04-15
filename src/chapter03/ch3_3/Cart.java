package chapter03.ch3_3;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> productList = new ArrayList<>();

    void addProduct(String name, int price) {
        productList.add(new Product(name, price));
    }

    void printCart() {
        for (Product product : productList) {
            System.out.println(product.getName() + ":" + product.getPrice());
        }
        System.out.println();
    }

    void removeProduct(String name) {
        boolean removed = true;
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                removed = false;
                productList.remove(product);
                break;
            }
        }
        if (removed) {
            System.out.println("카트에 해당 제품이 없음");
            System.out.println();
        }
    }

    int calculateTotalPrice() {
        int result = 0;
        for (Product product : productList) {
            result += product.getPrice();
        }
        return result;
    }
}
