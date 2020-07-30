package pl.krysinski.springw2.service;

import org.springframework.stereotype.Service;
import pl.krysinski.springw2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@Service
public class ShopService {
    private List<Product> productList;

    public ShopService(){
        Product product1 = new Product("Product1", randomPrice());
        Product product2 = new Product("Product2", randomPrice());
        Product product3 = new Product("Product3", randomPrice());
        Product product4 = new Product("Product4", randomPrice());
        Product product5 = new Product("Product5", randomPrice());
        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

    }

    private Double randomPrice(){
        int min = 50;
        int max = 300;
        double randomPrice = ThreadLocalRandom.current().nextDouble(min, max + 1);
        return roundPrice(randomPrice);
    }

    Double roundPrice(double price){
        double roundPrice = (double) Math.round(price * 100) / 100;
        return roundPrice;
    }

    public List<Product> getProductList(){
        return productList;
    }

    Double getSumProductsPrice(List<Product> productList){
        double sum = 0;
        for (Product product:productList) {
            sum += product.getProductPrice();
        }
        return roundPrice(sum);
    }

    void showProducts(){
        productList.forEach(System.out::println);
        System.out.println("Total price: " + getSumProductsPrice(getProductList()));
    }



}
