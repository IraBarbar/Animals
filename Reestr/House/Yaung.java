package Reestr.House;

public class Yaung implements House {

    private static final int houseID = 3;
    
    public static int getHouseid() {
        return houseID;
    }
    @Override
    public void nameHouse() {
       
        throw new UnsupportedOperationException("Молодые животные.");
    }

    @Override
    public void showID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showID'");
    }
    
}
