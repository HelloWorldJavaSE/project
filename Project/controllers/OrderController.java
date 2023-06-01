package controllers;

import service.ShopService;

import java.util.Scanner;

public class OrderController {
    public final ShopService shopService; // Сервис для работы с магазином

    public OrderController(ShopService shopService){
        this.shopService = shopService;
    }

    // Метод для создания заказа
    public boolean createOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Enter paymentType:");
        String paymentType = scanner.nextLine();
        System.out.println("Enter deliveryTime:");
        String deliveryTime = scanner.nextLine();
        return shopService.createOrder(name,address,phone,paymentType ,deliveryTime);
    }
}
