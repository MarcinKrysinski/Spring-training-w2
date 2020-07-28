package pl.krysinski.springw2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.krysinski.springw2.configuration.AppConfig;

@Component
@Profile("Standard")
public class ShopStandard extends ShopService {

    @Autowired
    AppConfig appConfig;

    @EventListener(ApplicationReadyEvent.class)
    public void calculatePrice(){
        System.out.println(super.getSumProductsPrice(getProductList()));
//        return super.getSumProductsPrice(getProductList());
    }
}
