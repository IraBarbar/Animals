package Reestr.Menu;

import java.util.Scanner;

import Reestr.Presenter.Presenter;

public class Menu implements ViewMenu {

    private Scanner iScanner;
    private final String textFotal = "Invalid input!";
    private Presenter presenter;
    Command[] options;

    public Menu(Presenter presenter) {
        iScanner = new Scanner(System.in);
        this.presenter = presenter;
        options = new Command[] {
                new AddNewAnimal(presenter),
                new ShowAllAnimals(presenter),
                new FindNameAnimal(presenter),
                new ShowTeamAnimal(presenter),
                new AddNewTeamAnimal(presenter),
                new SaveReestr(presenter),
                new ExitCommand()
               

        };
    }

    @Override
    public int getPunktMenu() {
        int num = 0;
        boolean validInput = false;
        while (!validInput) {
            String input = iScanner.next();
            if (isDigit(input)) {
                num = Integer.parseInt(input);
                if (num > 0) {
                    validInput = true;
                }
            }
            if (!validInput) {
                System.out.println(textFotal);
            }
        }        
        return num;
    }

    @Override
    public void setPunktMenu(int num) {
        System.out.printf("Selected menu item: %d\n", num);

    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void printMenu() {
        System.out.println("\t-------Menu-------");
        int i = 1;
        for (Command command : options) {
            System.out.printf("\t%d. ", i++);
            command.printCommand();
        }
    }

    public int getIndex() {
        int num = 0;
        boolean validInput = false;
        System.out.println("Enter the index: ");
        while (!validInput) {
            String input = iScanner.next();
            if (isDigit(input)) {
                num = Integer.parseInt(input);
                if (num > 0) {
                    validInput = true;
                }
            }
            if (!validInput) {
                System.out.println(textFotal);
            }
        }       
        return num;
    }
    
    public Presenter getPresenter() {
        return presenter;
    }
    
}
