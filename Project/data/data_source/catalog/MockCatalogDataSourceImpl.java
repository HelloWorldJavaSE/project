package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource{
    //Реализуем весь минимум для работы установленый в абстрактном классе CatalogDataSource

    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products =new ArrayList<>();
        //Создаем первоночальный ассортимент товаров
        products.add(new Product("1","Iphone","Top Phone",true,100000));

        return products;
    }
}
