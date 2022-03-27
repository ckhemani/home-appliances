package house;

public class Dryer extends HomeAppliances{
    //Fields
    String loadType;

    //Constructer

    public Dryer(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, String loadType) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        this.loadType = loadType;
    }

    //Getters and Setters

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    //Methods
    public String need240plug(){
        return "I need 240V Power Socket to opeatare";
    }

    //To_String
    @Override
    public String toString() {
        return "Dryer{" +
                "loadType='" + loadType + '\'' +
                '}';
    }
}

