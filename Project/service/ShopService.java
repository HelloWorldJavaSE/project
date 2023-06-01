package service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource; // Источник данных для каталога
    final CartDataSource cartDataSource; // Источник данных для корзины
    final OrderDataSource orderDataSource; // Источник данных для заказов

    public ShopService(CatalogDataSource catalogDataSource ,CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource ;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    // Метод для получения каталога товаров
    public ArrayList<Product> getCatalog(){
        return catalogDataSource.getCatalog();
    }

    // Метод для получения содержимого корзины
    public ArrayList<CartItem> getCart(){
        return cartDataSource.getCatalog();
    }

    // Метод для добавления товара в корзину
    public boolean addToCart(String productId,int count){
        ArrayList<Product> catalog = getCatalog();
        for (Product p : catalog){
            if(p.id.equals(productId) && p.available && p.price == count){
                cartDataSource.addToCart(p,count);
                return true;
            }
        }
        return false;
    }

    // Метод для создания заказа
    public boolean createOrder(String name, String address, String phone, String paymentType, String deliveryTime){
        ArrayList<CartItem> cart = getCart();
        Order order= new Order(name,address,phone,paymentType,deliveryTime,cart);
        orderDataSource.createOrder(order);
        return true;
    }
}
