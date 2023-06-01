package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    //Метод для получения каталога
    public abstract ArrayList<Product> getCatalog();
}
