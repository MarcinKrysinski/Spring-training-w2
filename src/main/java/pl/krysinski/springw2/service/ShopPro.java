package pl.krysinski.springw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.krysinski.springw2.configuration.AppConfig;

@Component
@Profile("Pro")
public class ShopPro extends ShopPlus{

    @Autowired
    public ShopPro(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Override
    public void calculatePrice(){
        showProducts();
        double price = super.getSumProductsPrice(getProductList());
        double discount = appConfig.getDiscount();
        System.out.println("Total price with 20% discount: " + super.roundPrice(price * (1 - discount)));
    }
}
