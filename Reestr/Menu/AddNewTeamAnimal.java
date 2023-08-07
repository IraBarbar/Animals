package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class AddNewTeamAnimal  implements Command{
    private Presenter presenter;

    

    public AddNewTeamAnimal(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        presenter.AddNewTeamAnimal();
    }

    @Override
    public void printCommand() {
        System.out.println(("Добавить новую команду."));
    }
}
