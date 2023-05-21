package view;

import java.util.ArrayList;

public class MainView extends AppView{
    //Класс который мы будем использовать как сборку всех наследников AppView
    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {
        System.out.println("Welcome");
    }


}
