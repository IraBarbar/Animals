package Reestr.House;


public class Barn implements House {
   
    private  final int houseID = 2;
    
    public  int getHouseid() {
        return houseID;
    }
    

    @Override
    public void nameHouse() {
        System.out.println("Сарай");
    }


    @Override
    public void showID() {
        System.out.println(getHouseid());
    }
    
}
