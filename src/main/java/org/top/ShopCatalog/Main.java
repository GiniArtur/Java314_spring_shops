package org.top.ShopCatalog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.top.ShopCatalog.model.Shop;
import org.top.ShopCatalog.service.RegisterService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");

        RegisterService registerService = classPathXmlApplicationContext.getBean(RegisterService.class);
        Shop shop = Shop.builder()
                .name("светофор")
                .phoneNumber("88005555538")
                .shopDescription("Выгодные оптовые цены всем городе")
                .email("svetofor@mail.ru")
                .websiteLink("svetofor.ru")
                .category("Traffic_lite")
                .address("Пушкина д18")
                .build();

        registerService.register(shop.getName(),shop.getAddress(), shop.getEmail(), shop.getPhoneNumber(), shop.getWebsiteLink(), shop.getCategory(), shop.getShopDescription());
    }
}
