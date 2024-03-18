package Rooms;

public class HotelLuxuryRoom extends HotelRoom {
    private boolean hasKitchen;
    public HotelLuxuryRoom(int room_Id, int bedrooms) {
        super(room_Id, 4);
        this.hasKitchen = true;
    }
}
