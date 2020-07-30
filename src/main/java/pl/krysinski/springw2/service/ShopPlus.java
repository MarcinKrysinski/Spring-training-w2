package pl.krysinski.springw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.krysinski.springw2.configuration.AppConfig;



@Component
@Profile("Plus")
public class ShopPlus extends ShopStandard{

    @Autowired
    public ShopPlus(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public ShopPlus() {
    }


    @Override
    public void calculatePrice(){
        showProducts();
        double price = super.getSumProductsPrice(getProductList());
        double vat = appConfig.getVat();
        System.out.println("Total Price with 23% VAT:  " + super.roundPrice(price * (1 + vat)));
    }



}
