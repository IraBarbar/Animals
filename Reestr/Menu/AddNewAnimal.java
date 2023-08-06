package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class AddNewAnimal implements Command {

    private Presenter presenter;

    

    public AddNewAnimal(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        presenter.append();
    }

    @Override
    public void printCommand() {
        System.out.println(("Добавить нового животного."));
    }
    
}
