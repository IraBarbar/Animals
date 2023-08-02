package Reestr.Animal;

public abstract class Pack extends Animal  {
    private final static int class_typeID = 2;



    public Pack(String name, char gender, int year_birth, int month_birth, int day_birth) {
        super(name, gender, year_birth, month_birth, day_birth);
    }



    public int getClass_typeID() {
        return class_typeID;
    }
    
}
