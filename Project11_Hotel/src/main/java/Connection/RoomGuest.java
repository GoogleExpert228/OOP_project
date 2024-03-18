package Connection;

import Rooms.HotelRoom;
import Guest.Guest;

public class RoomGuest {
    private HotelRoom room;
    private Guest guest;

    public RoomGuest(HotelRoom room, Guest guest) {
           this.room = room;
           this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "guest=" + guest +
                ", room=" + room +
                '}';
    }
}
