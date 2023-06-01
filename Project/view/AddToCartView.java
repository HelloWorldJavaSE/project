package view;

import controllers.AddToCartController;
import service.ShopService;

import java.util.ArrayList;

public class AddToCartView extends AppView {
    final ShopService shopService;

    public AddToCartView(ShopService shopService)
    {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        AddToCartController addToCartController = new AddToCartController(shopService);
        //Проверяем добавлен ли товар в корзину
        if (addToCartController.addToCart()) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
