package house;

public class Washer extends HomeAppliances {
    String loadType;

    // Constructor

    public Washer(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, String loadType) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        this.loadType = loadType;
    }

    //Getter  and Setters

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public boolean isSteamCycleAvailable(){
        return true;
    }

    // To_String

    @Override
    public String toString() {
        return "Washer{" +
                "loadType='" + loadType + '\'' +
                '}';
    }
}
