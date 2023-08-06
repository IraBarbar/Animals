package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class ShowTeamAnimal implements Command {
    private Presenter presenter;

    public ShowTeamAnimal(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        presenter.showTeam();
    }

    @Override
    public void printCommand() {
        System.out.println("Показать команды животного.");
    }
    
}
