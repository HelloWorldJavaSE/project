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
        // Создание источников данных для каталога, корзины и заказов
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();

        //Слово “представление” в данном контексте относится к классам, которые наследуются от класса AppView и отвечают за отображение информации пользователю.

        // Создание сервиса для работы с магазином
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);

        // Создание представлений для добавления товара в корзину, корзины, каталога и заказа
        AddToCartView addToCartView = new AddToCartView(shopService);
        CartView cartView = new CartView(shopService);
        CatalogView catalogView = new CatalogView(shopService,new ArrayList<>(List.of(addToCartView)));
        OrderView orderView = new OrderView(shopService);

        // Создание главного представления магазина
        MainView mainView = new MainView(new ArrayList<>(List.of(catalogView,cartView,orderView)));

        // Запуск магазина
        new ShopController(mainView,shopService).run();
    }
}
