package controllers;

import service.ShopService;
import view.AppView;

import java.util.Scanner;

public class ShopController {

    final AppView appView; // Представление магазина
    public final ShopService shopService; // Сервис для работы с магазином

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
    }

    // Метод для запуска магазина
    public void run(){
        while (true){
            appView.action(); // Выполнение действия текущего представления
            appView.displayChildren(); // Отображение дочерних представлений
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value < 0 || value>appView.children.size()+1){
                System.out.println("Wrong value!");
            } else if (value == appView.children.size()+1) {
                break; // Выход из цикла при выборе кнопки "Назад"
            }else {
                new ShopController(appView.children.get(value-1),shopService).run(); // Запуск выбранного дочернего представления
            }
        }
    }
}
