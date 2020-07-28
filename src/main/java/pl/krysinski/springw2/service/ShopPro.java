package pl.krysinski.springw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.krysinski.springw2.configuration.AppConfig;

@Component
@Profile("Pro")
public class ShopPro extends ShopPlus{

    @Autowired
    AppConfig appConfig;

    @Override
    public void calculatePrice(){
        double price = super.getSumProductsPrice(getProductList());
        System.out.println("SPro1 " + super.getSumProductsPrice(getProductList()));
        double discount = appConfig.getDiscount();
        System.out.println("SPro2 " + super.roundPrice(price * (1 - discount)));
//        return super.roundPrice(price * (1 - discount));
    }
}
