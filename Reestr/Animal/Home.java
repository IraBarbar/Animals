package Reestr.Animal;

public abstract class Home extends Animal  {

    

    public Home(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        super(animalID, name, gender, year_birth, month_birth, day_birth);
        setClass_typeID(1);    
    }

    public Home (int animalID, int class_typeID, int classID, String name, char gender, int year_birth, int month_birth, int day_birth,
                        int year_createdAt, int month_createdAt,int day_createdAt,
                        int is_active,
                        int year_leaveAt, int month_leaveAt, int day_leaveAt){

        super(animalID, class_typeID, classID, name, gender, 
                year_birth, month_birth, day_birth, 
                year_createdAt, month_createdAt, day_createdAt, is_active, 
                year_leaveAt, month_leaveAt, day_leaveAt);
                            
    }

    


}

