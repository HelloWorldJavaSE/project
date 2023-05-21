package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    //Устанавливаем самый минимум для всех CartDataSourceImpl
    public abstract ArrayList<CartItem> getCatalog();
    public abstract void addToCart(Product product, int count);
}
