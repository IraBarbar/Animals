package Reestr.Menu;

import Reestr.Presenter.Presenter;

public class SaveReestr implements Command{
   private Presenter presenter;

    public SaveReestr(Presenter presenter) {
        this.presenter = presenter;
    }

    public void execute() {
        presenter.save();
    }

    @Override
    public void printCommand() {
        System.out.println("Сохранить изменения.");
    } 
}
