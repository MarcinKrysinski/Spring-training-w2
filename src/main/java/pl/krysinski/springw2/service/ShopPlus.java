package pl.krysinski.springw2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.krysinski.springw2.configuration.AppConfig;
import pl.krysinski.springw2.controller.ShopStart;


@Component
@Profile("Plus")
public class ShopPlus extends ShopStandard{

    @Autowired
    AppConfig appConfig;

//    @Autowired
//    ShopStart shopStart;

    @Override
    public void calculatePrice(){
        double price = super.getSumProductsPrice(getProductList());
//        double price = shopStart.getProductsSum();
//        System.out.println("SP1 " + shopStart.getProductsSum());
        System.out.println("SP1 " + super.getSumProductsPrice(getProductList()));
        double vat = appConfig.getVat();
        System.out.println("SP2 " + super.roundPrice(price * (1 + vat)));
//        return super.roundPrice(price * (1 + vat));
    }



}
