package org.example;

public abstract class HotelRoom {
    private int Room_Id;
    private int bedrooms;

    public HotelRoom(int room_Id, int bedrooms) {
        Room_Id = room_Id;
        this.bedrooms = bedrooms;
    }
}
