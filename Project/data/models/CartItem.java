package data.models;

public class CartItem {
    //корзина с товарами
    public final Product product;
    public final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
