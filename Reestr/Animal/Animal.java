package Reestr.Animal;


import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal implements Team, Printinfo {

    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int animalID;

    private String name;
    private char gender;

    int year_birth;
    int month_birth;
    int day_birth;
    
    private LocalDate birthday; 
    private LocalDate createdAt;
    private int houseID;
    private char is_active;
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



    public int getHouseID() {
        return houseID;
    }



    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }



    public char getIs_active() {
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



    public Animal( String name, char gender, int year_birth, int month_birth, int day_birth, int houseID) {
        animalID = COUNTER.getAndIncrement();
    
        this.name = name;
        this.gender = gender;

        LocalDate date_birth = LocalDate.of(year_birth, month_birth, day_birth);
        this.birthday = date_birth;

        LocalDate date = LocalDate.now();
        this.createdAt = date;
        this.houseID = houseID;
        this.is_active = 1;
    }

   

    
    
}
