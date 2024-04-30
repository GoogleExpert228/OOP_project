package Rooms;

public class HotelLuxuryRoom extends HotelRoom {
    private boolean hasKitchen;
    public HotelLuxuryRoom(int room_Id, boolean isAvailable) {
        super(room_Id, 4, isAvailable);
        this.hasKitchen = true;
    }


    @Override
    public String toXML() {
        return null;
    }
}
