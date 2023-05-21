package service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource ,CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource ;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }
    public ArrayList<Product> getCatalog(){
        return catalogDataSource.getCatalog();
    }
    public ArrayList<CartItem> getCart(){
        return cartDataSource.getCatalog();
    }
    public boolean addToCart(String productId,int count){
        ArrayList<Product> catalog = getCatalog();
        //Обходим весь каталог и проверяем на верность данных
        for (Product p : catalog){
            if(p.id.equals(productId) && p.available && p.price == count){
                cartDataSource.addToCart(p,count);
                return true;
            }
        }
        return false;
    }
    public boolean createOrder(String name, String address, String phone, String paymentType, String deliveryTime){
        //Метод получающий данные создаем заказ через абстрактный метод у orderDataSource
        ArrayList<CartItem> cart = getCart();
        Order  order= new Order(name,address,phone,paymentType,deliveryTime,cart);
        orderDataSource.createOrder(order);
        return true;
    }
}
