package data.models;

import data.models.CartItem;

import java.util.ArrayList;

public class Order {
    //Заказ
    public final String name;
    public final String address;
    public final String phone;
    public final String paymentType;
    public final String deliveryTime;
    public final ArrayList<CartItem> cart; // Для заказа нам нужна корзина товаров
    public Order(String name, String address, String phone, String paymentType, String deliveryTime, ArrayList<CartItem> cart) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
    }
}
