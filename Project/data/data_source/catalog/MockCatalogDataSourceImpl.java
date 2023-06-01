package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource{
    // Метод для получения каталога товаров
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products =new ArrayList<>();
        products.add(new Product("1","Iphone","Top Phone",true,100000));
        return products;
    }
}
