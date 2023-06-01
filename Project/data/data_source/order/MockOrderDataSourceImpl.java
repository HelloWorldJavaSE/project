package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{
    private Order order; // Заказ

    // Метод для создания заказа
    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
