package Reestr.Model;

import java.io.IOException;
import java.util.Iterator;

import Reestr.Animal.Animal;
import Reestr.Reestr.Reestr;

public class Model implements Iterable<Animal> {
    Reestr reestr;
    private String path;
    

    public Model(String path) {
        reestr = new Reestr();
        this.path = path;
    }

    public void addDog(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth){
        reestr.madeDog(animalID, name, gender, year_birth, month_birth, day_birth);
    }

    public void addCat(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth){
        reestr.madeCat(animalID, name, gender, year_birth, month_birth, day_birth);
    }

    public void addCamel(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth){
        reestr.madeCamel(animalID, name, gender, year_birth, month_birth, day_birth);
    }

    public void addDonkey(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth){
        reestr.madeDonkey(animalID, name, gender, year_birth, month_birth, day_birth);
    }

    public void addHorce(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth){
        reestr.madeHorce(animalID, name, gender, year_birth, month_birth, day_birth);
    }

    @Override
    public Iterator<Animal> iterator() {
        Iterator<Animal> it = new Iterator<Animal>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < reestr.size();
            }

            @Override
            public Animal next() {
                return reestr.get(i++);
            }
        };
        return it;
    }
    public void load() {
        try {
           reestr.addAll(new TextFileHandler().read( path));

        } catch (IOException e) {
            e.printStackTrace();
        }    
        
    }

    public void showAll() {
        for (Animal animal : reestr) {
            System.out.println( animal.toString());
        }
    }
    
    public int size() {
        return reestr.size();
    }
    
    public int countID(){
        return reestr.size() + 1 ;

    }

    public void save() throws Exception {  
        try {
            new TextFileHandler().write(path, reestr);
        } catch (Exception e) {          
        }
    }

    public void showTeam(int animalID){
        reestr.showTeam(reestr, animalID);
    }

    public void findNameAnimal(String name){
        reestr.findAnimalName(reestr, name);
    }

    public void addNewTeam(int animalID ,String team){
        reestr.addTeam(reestr, animalID, team);
    }
    
}
