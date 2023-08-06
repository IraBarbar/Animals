package Reestr.Menu;

import Reestr.Presenter.Confing;
import Reestr.Presenter.Presenter;

public class App {
    Presenter presenter;
    ConsolePrint view;
    Menu menu;

    public App() {
        view = new ConsolePrint();
        presenter = new Presenter(view, Confing.pathDB );
        menu = new Menu(presenter);
    }

    public void start() {
        boolean continueLoop = true;
        presenter.loadFromFile();
        while (continueLoop) {
            menu.printMenu();
            int optionNum = menu.getPunktMenu() - 1;
            if (optionNum >= 0 && optionNum < menu.options.length) {
                menu.options[optionNum].execute();
            }
        }
    }
}
