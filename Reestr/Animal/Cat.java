package Reestr.Animal;

public class Cat extends Home {

    private static final  int classID = 101;


    public static int getClassid() {
        return classID;
    }

    public Cat(String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        super(name, gender, year_birth, month_birth, day_birth, houseID);
        
    }

    @Override
    public void team() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Мурлыкать!");
    }

    @Override
    public void printinfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printinfo'");
    }

    
}
