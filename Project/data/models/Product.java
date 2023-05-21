package data.models;
public class Product {
    //Сам продукт
    public final String id;
    public final String title;
    public final String description;
    public final boolean available;
    public final int price;

    public Product(String id, String title, String description, boolean available, int price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.available = available;
        this.price = price;
    }

}
