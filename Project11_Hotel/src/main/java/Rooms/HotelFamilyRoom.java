package Rooms;

public class HotelFamilyRoom  extends HotelRoom {
    public HotelFamilyRoom(int room_Id, boolean isAvailable) {
        super(room_Id, 4, isAvailable);
    }

    @Override
    public String toXML() {
        return null;
    }
}
