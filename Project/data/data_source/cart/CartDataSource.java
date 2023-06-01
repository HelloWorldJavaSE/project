package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    // Абстрактный метод для получения содержимого корзины
    public abstract ArrayList<CartItem> getCatalog();

    // Абстрактный метод для добавления товара в корзину
    public abstract void addToCart(Product product, int count);
}
