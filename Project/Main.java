
import controllers.ShopController;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImpl;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSourceImpl;
import data.data_source.order.MockOrderDataSourceImpl;
import data.data_source.order.OrderDataSource;
import service.ShopService;
import view.*;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);

        AddToCartView addToCartView = new AddToCartView(shopService);
        CartView cartView = new CartView(shopService);
        CatalogView catalogView = new CatalogView(shopService,new ArrayList<>(List.of(addToCartView)));
        /*Так как addToCartView занесен в children у catalogView
        он будет использоваться в new ShopController(appView.children.get(value-1),shopService).run();*/
        OrderView orderView = new OrderView(shopService);

        MainView mainView = new MainView(new ArrayList<>(List.of(catalogView,cartView,orderView)));
        //Указываем всех children для Сборочного класса наследников AppView которых будут обходить в ShopController.run
        new ShopController(mainView,shopService).run();
    }
}