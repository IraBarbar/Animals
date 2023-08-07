package Reestr.Presenter;

import Reestr.Animal.Donkey;
import Reestr.Menu.ViewConsole;
import Reestr.Model.Model;

public class Presenter {
    ViewConsole view ;
    Model model;

    public Presenter(ViewConsole view, String path) {
        this.view = view;
        model = new Model(path);
    }

    public void append (){
        int classID = view.choiceAnimal();
        String name = view.inputName();
        char gender = view.inputGender();
        int year_birth = view.inputYear_birth(); 
        int month_birth = view.inputMonth_birth();
        int day_birth = view.inputDay_birth();
        switch (classID) {
            case 1:
                model.addDog( model.countID(), name, gender, year_birth,month_birth, day_birth);
                
                break;
            case 2:
                model.addCat( model.countID(), name, gender, year_birth,month_birth, day_birth);
                
                break;
            case 101:
                model.addDonkey(model.countID(), name, gender, year_birth, month_birth, day_birth);
                
                break;
            case 102:
                model.addCamel(model.countID(), name, gender, year_birth, month_birth, day_birth);
                
                break;
            case 103:
                model.addHorce(model.countID(), name, gender, year_birth, month_birth, day_birth);
                
                break;
        
            default:
                break;
        }

    }
    
    public void loadFromFile() {
        model.load();
    }

    public void show (){
        model.showAll();
    }



    public void save (){
        try {
            model.save();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void showTeam(){
        model.showTeam(view.choiceAnimalID());
        
    }

    public void findNameAnimal(){
        model.findNameAnimal(view.findNameAnimal());
    }
    public void AddNewTeamAnimal(){
        
        model.addNewTeam(view.choiceAnimalID(), view.addNewTeam());
    }
    

}
