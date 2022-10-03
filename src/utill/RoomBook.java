package utill;

public class RoomBook {
    private String id;
    private String name;
    private String contact;
    private String email;
    private String roomNumber;
    private String price;
    private String time;
    private String meal;

    public RoomBook() {
    }

    public RoomBook(String id, String name, String contact, String email, String roomNumber, String price, String time, String meal) {
        this.setId(id);
        this.setName(name);
        this.setContact(contact);
        this.setEmail(email);
        this.setRoomNumber(roomNumber);
        this.setPrice(price);
        this.setTime(time);
        this.setMeal(meal);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }
}
