package data.models;
//Корзина с товарами
public class CartItem {
    public final Product product; // Товар
    public final int count; // Количество товара

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
