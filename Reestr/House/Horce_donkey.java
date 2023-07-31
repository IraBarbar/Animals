package Reestr.House;

public class Horce_donkey implements House {

    private static final int houseID = 4;
    
    public static int getHouseid() {
        return houseID;
    }

    @Override
    public void nameHouse() {
        
        throw new UnsupportedOperationException("Лошадь-осель.");
    }

    @Override
    public void showID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showID'");
    }
    
}
