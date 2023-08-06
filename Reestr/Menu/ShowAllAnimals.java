package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class ShowAllAnimals implements Command {
    private Presenter presenter;

    public ShowAllAnimals(Presenter presenter) {
        this.presenter = presenter;
    }

    public void execute() {
        presenter.show();
    }

    @Override
    public void printCommand() {
        System.out.println("Показать всех животных.");
    }
}
