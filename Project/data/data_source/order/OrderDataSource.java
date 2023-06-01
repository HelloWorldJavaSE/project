package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {
    //Абстрактный метод для создания заказа
    public abstract void createOrder(Order order);
}
