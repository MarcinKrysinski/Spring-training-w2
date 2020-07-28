package pl.krysinski.springw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krysinski.springw2.service.ShopService;
import pl.krysinski.springw2.model.Product;

import java.util.List;

@RestController
public class ShopStart {

    private ShopService shopService;

    @Autowired
    public ShopStart(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return shopService.getProductList();
    }


//    @RequestMapping("/sum")
//    public Double getProductsSum(){
//        return shopService.getSumProductsPrice(getAllProducts());
//    }



}
