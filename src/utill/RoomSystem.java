package utill;

public class RoomSystem {
    private String roomNumber;
    private String type;
    private String availble;
    private String capacity;
    private String price;

    public RoomSystem() {
    }

    public RoomSystem(String roomNumber, String type,String availble,String capacity, String price) {
        this.setRoomNumber(roomNumber);
        this.setType(type);
        this.setCapacity(capacity);
        this.setPrice(price);
        this.setAvailble(availble);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailble() {
        return availble;
    }

    public void setAvailble(String availble) {
        this.availble = availble;
    }
}
