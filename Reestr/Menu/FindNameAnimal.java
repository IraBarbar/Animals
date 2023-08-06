package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class FindNameAnimal implements Command {
    private Presenter presenter;

    

    public FindNameAnimal(Presenter presenter) {
        this.presenter = presenter;
    }
    @Override
    public void execute() {
        presenter.findNameAnimal();
    }

    @Override
    public void printCommand() {
       System.out.println("Найти животное по имени.");;
    }
    
}
