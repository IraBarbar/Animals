package Reestr.House;

public class Horce_donkey implements House {

    private  final int houseID = 4;
    
    public  int getHouseid() {
        return houseID;
    }

    @Override
    public void nameHouse() {
        
        System.out.println("Лошадь-осел.");
    }

    @Override
    public void showID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showID'");
    }
    
}
