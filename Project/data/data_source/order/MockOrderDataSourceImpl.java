package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{
    //Реализуем весь минимум для работы установленый в абстрактном классе OrderDataSource
    private Order order;

    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
