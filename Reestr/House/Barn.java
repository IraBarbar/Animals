package Reestr.House;


public class Barn implements House {
   
    private static final int houseID = 2;
    
    public static int getHouseid() {
        return houseID;
    }

    @Override
    public void nameHouse() {
        
        throw new UnsupportedOperationException("Сарай.");
    }

    @Override
    public void showID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showID'");
    }
    
}
