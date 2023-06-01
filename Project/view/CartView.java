package view;

import data.models.CartItem;
import service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView{
    public final ShopService shopService; // Сервис для работы с магазином

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    // Метод для отображения содержимого корзины
    @Override
    public void action() {
        ArrayList<CartItem> cartItems = shopService.getCart();
        for (CartItem cartItem : cartItems) {
            System.out.println(cartItem.count + " - " + cartItem.product.title);
        }
    }
}
