package data.models;
//Продукт
public class Product {
    public final String id; // Id товара
    public final String title; // Название товара
    public final String description; // Описание товара
    public final boolean available; // Доступность товара
    public final int price; // Цена товара

    public Product(String id, String title, String description, boolean available, int price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.available = available;
        this.price = price;
    }
}
