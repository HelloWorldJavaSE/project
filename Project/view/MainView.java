package view;

import java.util.ArrayList;

public class MainView extends AppView{
    // Конструктор класса
    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    // Метод для отображения приветствия
    @Override
    public void action() {
        System.out.println("Welcome");
    }
}
