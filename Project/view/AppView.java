package view;


import java.util.ArrayList;

public abstract class  AppView {
    public final String title; // Текст который мы будем выводить

    public final ArrayList<AppView> children; //Наших детей мы будем обходить и вызывать абстрактный метод action()
    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract void action();


    public void displayChildren(){
        System.out.println("Chose from 1 to " + (children.size() + 1));
        // отображение children: CartItem || Order || Product
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i+1) + " " +children.get(i).title);
        }
        System.out.println((children.size()+1) + " Back");
    }
}
