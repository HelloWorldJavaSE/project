package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource{
    //Реализуем весь минимум для работы установленый в абстрактном классе CartDataSource
    private ArrayList<CartItem> cart = new ArrayList<>();

    @Override
    public ArrayList<CartItem> getCatalog() {
        return cart;
    }

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product,count));
    }
}
