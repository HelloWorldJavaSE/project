package view;

import data.models.Product;
import service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    final ShopService shopService;

    public CatalogView(ShopService shopService,ArrayList<AppView> children) {
        super("Catalog",children);
        this.shopService =shopService;
    }

    @Override
    public void action() {
        //Отображаем наш каталог обходя все его товары
        ArrayList<Product> products = shopService.getCatalog();
        System.out.println("--- Catalog ---");
        for (Product p : products){
            System.out.println( "Id: "+ p.id + " " + p.title +" Price: " + p.price);
        }
        System.out.println();
    }
}
