package utill;

public class MealSystem {
    private String plane;
    private String price;
    private String destription;

    public MealSystem() {
    }

    public MealSystem(String plane, String price, String destription) {
        this.setPlane(plane);
        this.setPrice(price);
        this.setDestription(destription);
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDestription() {
        return destription;
    }

    public void setDestription(String destription) {
        this.destription = destription;
    }
}
