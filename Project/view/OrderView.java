package view;

import controllers.OrderController;
import service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView{
    final ShopService shopService; // Сервис для работы с магазином

    public OrderView(ShopService shopService) {
        super("Order",new ArrayList<>());
        this.shopService = shopService;
    }

    // Метод для создания заказа
    @Override
    public void action() {
        OrderController orderController = new OrderController(shopService);
        if(orderController.createOrder()){
            System.out.println("Success");
        }
    }
}
