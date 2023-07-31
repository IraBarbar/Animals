package Reestr.Animal;

public abstract class Home extends Animal {

    private final static int class_typeID = 1;


    public Home(String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        super(name, gender, year_birth, month_birth, day_birth, houseID);
        
    }


    public int getClass_typeID() {
        return class_typeID;
    }

}

