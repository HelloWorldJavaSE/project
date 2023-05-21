package view;

import data.models.CartItem;
import service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView{
    public final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList< CartItem> cartItems = shopService.getCart();
        for (CartItem cartItem : cartItems) // Обходим нашу корзину
        {
            System.out.println(cartItem.count + " - " + cartItem.product.title);
        }
    }
}
