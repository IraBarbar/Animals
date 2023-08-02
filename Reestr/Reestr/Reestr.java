package Reestr.Reestr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Reestr.Animal.Animal;

public class Reestr  implements Iterable<Animal>{
   List<Animal> animals;
   private int size;

public Reestr() {
     animals = new ArrayList<Animal>(null);
     size = 0;
}


public void add(Animal one){
    
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
   
   


}
