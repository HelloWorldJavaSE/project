package view;

import java.util.ArrayList;

public abstract class AppView {
    public final String title; // Предстовление
    public final ArrayList<AppView> children; // Список дочерних предстовлений

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }

    // Абстрактный метод для отображения
    public abstract void action();

    // Метод для отображения дочерних заголовков
    public void displayChildren(){
        System.out.println("Выберите от 1 до " + (children.size() + 1));
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i+1) + " " +children.get(i).title);
        }
        System.out.println((children.size()+1) + " Назад");
    }
}
