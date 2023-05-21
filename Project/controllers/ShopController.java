package controllers;

import service.ShopService;
import view.AppView;

import java.util.Scanner;

public class ShopController {

    final AppView appView;
    public final ShopService shopService;

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
    }
    public void run(){
        while (true){
            appView.action();
            appView.displayChildren();
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value < 0 || value>appView.children.size()+1){
                System.out.println("Wrong value!");
            } else if (value == appView.children.size()+1) {
                /* Если значение веденное пользователем больше числа детей ( это кнопка Back ) */ break;
            }else {
                //Запускаем этот же метод только уже у appView.children
                new ShopController(appView.children.get(value-1),shopService).run();
            }
        }
    }
}
