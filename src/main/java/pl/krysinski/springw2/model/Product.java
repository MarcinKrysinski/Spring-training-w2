package pl.krysinski.springw2.model;

public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return  "ProductName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
