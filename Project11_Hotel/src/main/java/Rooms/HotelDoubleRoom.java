package Rooms;

public class HotelDoubleRoom extends HotelRoom {
    public HotelDoubleRoom(int room_Id, boolean isAvailable) {
        super(room_Id, 2, isAvailable);
    }

    @Override
    public String toXML() {
        return null;
    }
}
