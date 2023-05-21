package view;

import controllers.OrderController;
import service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView{
    final ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Order",new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        //Проверяем Создан ли заказ
        OrderController orderController = new OrderController(shopService);
        if(orderController.createOrder()){
            System.out.println("Success");
        }

    }
}
