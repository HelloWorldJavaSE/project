package controllers;

import service.ShopService;

import java.util.Scanner;

public class OrderController {
    public final ShopService shopService;
    public OrderController(ShopService shopService){
        this.shopService = shopService;
    }

    public boolean createOrder(){
        //Это метод который будет вызываться у appView.children
        //Получаем все данные от пользователя затем используя их создаем заказ через shopService.createOrder
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
