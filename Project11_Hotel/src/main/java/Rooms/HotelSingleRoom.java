package Rooms;

public class HotelSingleRoom extends HotelRoom {
    public HotelSingleRoom(int roomNumber, boolean isAvailable) {
        super(roomNumber, 1, isAvailable);
    }

    @Override
    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<room>\n");
        xml.append("   <number>").append(getRoomNumber()).append("</number>\n");
        xml.append("   <bedrooms>").append(getBedrooms()).append("</bedrooms>\n");
        xml.append("  <available>").append(getIsAvailable()).append("</available>\n");
        xml.append("</room>\n");
        return xml.toString();
    }
}
