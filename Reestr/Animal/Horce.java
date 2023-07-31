package Reestr.Animal;

public class Horce extends Pack {

    private static final  int classID = 104;

    public static int getClassid() {
        return classID;
    }

    public Horce(String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        super(name, gender, year_birth, month_birth, day_birth, houseID);
        
    }

    @Override
    public void team() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Перевозить!");
    }

    @Override
    public void printinfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printinfo'");
    }
    
}
