package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource{
    private ArrayList<CartItem> cart = new ArrayList<>(); // Список элементов корзины

    // Метод для получения содержимого корзины
    @Override
    public ArrayList<CartItem> getCatalog() {
        return cart;
    }

    // Метод для добавления товара в корзину
    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product,count));
    }
}
