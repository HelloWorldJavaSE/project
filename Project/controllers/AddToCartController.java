package controllers;

import service.ShopService;

import java.util.Scanner;

public class AddToCartController {
    public ShopService shopService;

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    public boolean addToCart() {
        //Это метод который будет вызываться у appView.children
        //Получаем все данные от пользователя затем используя их создаем заказ через shopService.addToCart
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product Price: ");
        int count = scanner.nextInt();
        return shopService.addToCart(productId,count);
    }
}
