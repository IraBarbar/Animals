package Reestr.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Camel extends Pack {

    private static final int classID = 102;

    public static int getClassid() {
        return classID;
    }

    public Camel(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        super(animalID, name, gender, year_birth, month_birth, day_birth);
        setClassID(102);
        setClass_typeID(2);
        
    }

    public Camel(int animalID, int class_typeID, int classID, String name, char gender, int year_birth, int month_birth,
            int day_birth,
            int year_createdAt, int month_createdAt, int day_createdAt,
            int is_active,
            int year_leaveAt, int month_leaveAt, int day_leaveAt) {

        super(animalID, class_typeID, classID, name, gender, year_birth, month_birth, day_birth,
                year_createdAt, month_createdAt, day_createdAt, is_active,
                year_leaveAt, month_leaveAt, day_leaveAt);

    }

 
    List <String> teams  = new ArrayList<>(Arrays.asList("Перевозить."));
    

    @Override
    public void team() {
        for (String string : teams) {
            System.out.println(" "+string);
        }
    }
        @Override
    public void addNewTeam(String team) {
        teams.add(team);   
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
