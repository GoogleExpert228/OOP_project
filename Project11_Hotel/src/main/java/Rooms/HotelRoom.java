package Rooms;

public abstract class HotelRoom {
    private int roomNumber;
    private int bedrooms;
    private boolean isAvailable;
    public HotelRoom(int roomNumber, int bedrooms, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.bedrooms = bedrooms;
    }

    public abstract String toXML();

    @Override
    public String toString() {
        return "HotelRoom{" +
                "Room_Id=" + roomNumber +
                ", bedrooms=" + bedrooms +
                ", bedrooms=" + isAvailable +
                '}';
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
}
