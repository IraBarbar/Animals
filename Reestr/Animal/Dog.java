package Reestr.Animal;

public class Dog extends Home {

    private static final  int classID = 1;


    public static int getClassid() {
        return classID;
    }

    public Dog(String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        super(name, gender, year_birth, month_birth, day_birth, houseID);
        
    }

    @Override
    public void team() {
        throw new UnsupportedOperationException("Лаять!");
    }

    @Override
    public void printinfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printinfo'");
    }
    
    
}
