package Reestr.Animal;


import java.time.LocalDate;

public abstract class Animal  implements Team, Printinfo , Comparable<Animal> {

    private final int animalID;
    private  int class_typeID;
   
    private  int classID;

    /**
     * 
     */
    
    
    public int getClassID() {
        return classID;
    }



    public void setClassID(int classID) {
        this.classID = classID;
    }



    public int getClass_typeID() {
        return class_typeID;
    }



    public void setClass_typeID(int class_typeID) {
        this.class_typeID = class_typeID;
    }



    private String name;
    private char gender;

    int year_birth;
    int month_birth;
    int day_birth;
    
    private LocalDate birthday;
    
    // private int year_createdAt;
    // private int month_createdAt;
    // private int day_createdAt;


    private LocalDate createdAt;
    
    private int is_active;

    // private int year_leaveAt;
    // private int month_leaveAt;
    // private int day_leaveAt;

    private LocalDate leaveAt;

    
    public int getAnimalID() {
        return animalID;
    }



    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }



    public char getGender() {
        return gender;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }

    
  
    public LocalDate getBirthday() {
        return birthday;
    }



    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }



    public LocalDate getCreatedAt() {
        return createdAt;
    }



    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }



    public int getIs_active() {
        return is_active;
    }



    public void setIs_active(char is_active) {
        this.is_active = is_active;
    }



    public LocalDate getLeaveAt() {
        return leaveAt;
    }



    public void setLeaveAt(LocalDate leaveAt) {
        this.leaveAt = leaveAt;
    }



    public Animal(int animalID, String name, char gender, int year_birth, int month_birth, int day_birth) {
        this. animalID = animalID;

        this.name = name;
        this.gender = gender;

        
        this.birthday = LocalDate.of(year_birth, month_birth, day_birth);

        
        this.createdAt = LocalDate.now();
        
        this.is_active = 1;
        this.leaveAt = LocalDate.of(1900, 1, 1);
    }

    public Animal(int animalID,int class_typeID, int classID,  String name, char gender, int year_birth, int month_birth, int day_birth,
                                            int year_createdAt, int month_createdAt,int day_createdAt,
                                            int is_active,
                                            int year_leaveAt, int month_leaveAt, int day_leaveAt) {
        this.animalID = animalID;
        this.class_typeID = class_typeID;
        this.classID = classID;
        this.name = name;
        this.gender = gender;

        this.birthday = LocalDate.of(year_birth, month_birth, day_birth);
        

        this.createdAt = LocalDate.of(year_createdAt, month_createdAt, day_createdAt);
        
        this.is_active = is_active ;
        this.leaveAt = LocalDate.of(year_leaveAt, month_leaveAt, day_leaveAt);

    }

   public String wrireText(){
        return    animalID + "," 
            + class_typeID + "," 
            + classID + "," 
            + name+ "," 
            + gender + "," 
            + birthday.getYear() + "," + birthday.getMonthValue() + "," + birthday.getDayOfMonth() + "," 
            + createdAt.getYear() +"," + createdAt.getMonthValue() +"," + createdAt.getDayOfMonth() +","
            + is_active + ","
            + leaveAt.getYear() + "," +  leaveAt.getMonthValue() + "," + leaveAt.getDayOfMonth();
   }




@Override
public String toString() {
    return  "Animal [animalID=" + animalID + ", class_typeID=" + class_typeID + ", classID=" + classID + ", name=" + name
            + ", gender=" + gender + ", birthday=" + birthday + 
             ", createdAt=" + createdAt  + ", is_active=" + is_active + ", leaveAt=" + leaveAt
             + "]";
}

   




    









    
    
}
