package Reestr.Reestr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import Reestr.Animal.Animal;
import Reestr.Animal.Camel;
import Reestr.Animal.Cat;
import Reestr.Animal.Dog;
import Reestr.Animal.Donkey;
import Reestr.Animal.Horce;

public class Reestr implements Iterable<Animal> {

    List<Animal> animals;

    public Reestr() {
        animals = new ArrayList<>();

    }

    public void madeDog(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        Dog dog = new Dog(animalID, name, gender, year_birth, month_birth, day_birth);
        animals.add(dog);

    }

    public void madeCat(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        Cat one = new Cat(animalID, name, gender, year_birth, month_birth, day_birth);
        animals.add(one);

    }

    public void madeCamel(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        Camel one = new Camel(animalID, name, gender, year_birth, month_birth, day_birth);
        animals.add(one);

    }

    public void madeDonkey(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        Donkey one = new Donkey(animalID, name, gender, year_birth, month_birth, day_birth);
        animals.add(one);

    }

    public void madeHorce(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        Horce one = new Horce(animalID, name, gender, year_birth, month_birth, day_birth);
        animals.add(one);

    }

    public Iterator<Animal> iterator() {

        Iterator<Animal> it = new Iterator<Animal>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < animals.size();
            }

            @Override
            public Animal next() {
                return animals.get(index++);
            }
        };
        return it;
    }

    public int size() {
        return animals.size();
    }

    public Animal get(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("The index is invalid!");
            return null;
        }
        return animals.get(index);
    }

    public void addAll(Collection<Animal> elements) {
        animals.addAll(elements);
    }

    public void showTeam(Reestr animals, int animalID) {
        boolean is_ok = false;
        for (Animal animal : animals) {
            if (animal.getAnimalID() == animalID) {
                System.out.printf(animal.getClass().getSimpleName());
                System.out.printf(": \n ");
                System.out.println("---------------------");
                animal.team();
                System.out.println();
                is_ok = true;
            }

        }
        if (!is_ok)
            System.out.println("Такого animalID нет.");

    }

    public void findAnimalName(Reestr animals, String name) {
        boolean is_ok = false;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.printf(animal.getClass().getSimpleName());
                System.out.printf(": ");
                System.out.println(animal.toString());
                is_ok = true;
            }

        }
        if (!is_ok)
            System.out.println("Такого животного нет.");

    }

        public void addTeam(Reestr animals, int animalID, String newTeam) {
        boolean is_ok = false;
        for (Animal animal : animals) {
            if (animal.getAnimalID() == animalID) {
                animal.addNewTeam(newTeam);
                is_ok = true;
            }
        

        }
        if (!is_ok)
            System.out.println("Такого animalID нет.");

    }

}
