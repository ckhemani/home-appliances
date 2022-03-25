package house;

public class HomeAppliances {
    //Fields for Home Appliances
    private String make;
    private String model;
    private String bodyType;
    private String price;
    private String plugType;
    private int voltageNeed;
    private int weight;

    //HomeAppliances Methods (Constructors

    public HomeAppliances() {
    }

    //HomeAppliances Methods with Parameters ( Constructors)

    public HomeAppliances(String make, String model, String bodyType, String plugType ,String price, int voltageNeed, int weight) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.plugType = plugType;
        this.price = price;
        this.voltageNeed = voltageNeed;
        this.weight = weight;
    }

    //Getters and Setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodytype(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getVoltageNeed() {
        return voltageNeed;
    }

    public void setVoltageNeed(int voltageNeed) {
        this.voltageNeed = voltageNeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Customized Methods
    public String waterConnection(){
        return "I need Water to Operate";
    }


    //To_String

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", plugType='" + plugType + '\'' +
                ", price='" + price + '\'' +
                ", voltageNeed=" + voltageNeed +
                ", weight=" + weight +
                '}';
    }
}

