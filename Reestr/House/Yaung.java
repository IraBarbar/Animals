package Reestr.House;

public class Yaung implements House {

    private  final int houseID = 3;
    
    public  int getHouseid() {
        return houseID;
    }
    @Override
    public void nameHouse() {
       
        System.out.println("Молодые животные.");
    }

    @Override
    public void showID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showID'");
    }
    
}
