package Reestr.Animal;

public class Cat extends Home {

    public Cat(int animalID, int class_typeID, int classID, String name, char gender, int year_birth, int month_birth,
            int day_birth, int year_createdAt, int month_createdAt, int day_createdAt, int is_active, int year_leaveAt,
            int month_leaveAt, int day_leaveAt) {
        super(animalID, class_typeID, classID, name, gender, year_birth, month_birth, day_birth, year_createdAt,
                month_createdAt, day_createdAt, is_active, year_leaveAt, month_leaveAt, day_leaveAt);
        // TODO Auto-generated constructor stub
    }

    public Cat(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        super(animalID, name, gender, year_birth, month_birth, day_birth);
        setClassID(2);
        setClass_typeID(1);
        
    }

    private final int classID = 2;


    public  int getClassid() {
        return classID;
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

    @Override
    public int compareTo(Animal o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

   

}
