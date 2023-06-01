package controllers;

import service.ShopService;

import java.util.Scanner;

public class AddToCartController {
    public ShopService shopService; // Сервис для работы с магазином

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    // Метод для добавления товара в корзину
    public boolean addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product Price: ");
        int count = scanner.nextInt();
        return shopService.addToCart(productId,count);
    }
}
