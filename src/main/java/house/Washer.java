package house;

public class Washer extends HomeAppliances {
    boolean isSteam;

    // Constructor

    public Washer(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, boolean isSteam) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        this.isSteam = isSteam;
    }

    //Getter  and Setters

    public boolean isSteam() {
        return true;
    }

    // To_String

    @Override
    public String toString() {
        return "Washer{" +
                "loadType='" + isSteam + '\'' +
                '}';
    }
}
