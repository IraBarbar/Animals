package Reestr.Animal;

public class Donkey extends Pack{

    private static final  int classID = 102;

    public static int getClassid() {
        return classID;
    }

    public Donkey(String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        super(name, gender, year_birth, month_birth, day_birth, houseID);
        //TODO Auto-generated constructor stub
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
