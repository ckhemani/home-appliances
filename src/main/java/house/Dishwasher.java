package house;

public class Dishwasher extends HomeAppliances {
    // Fields
    private int racks;

    //Constructors

    public Dishwasher(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, int racks) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        this.racks = racks;
    }

    // Constructors

    public Dishwasher(int racks) {
        this.racks = racks;
    }

    // Getters and Setters


    public int getRacks() {
        return racks;
    }

    public void setRacks(int racks) {
        this.racks = racks;
    }

    // Dishwasher Method
    public boolean needWater(){
        return true;
    }

    public String dishes(){
        return "I wash dishes";
    }

    //TO_STRING
    @Override
    public String toString() {
        return "HomeAppliances{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", plugType='" + getPlugType() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", voltageNeed=" + getVoltageNeed() +
                ", weight=" + getWeight() +
                ", No of Racks =" + getRacks() +
                '}';
    }
}


