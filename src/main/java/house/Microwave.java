package house;

public class Microwave extends HomeAppliances{
    String Range;

    // Constructors

    public Microwave(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, String range) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        Range = range;
    }


    // Getters and Setters

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    //Customized Methods


    //To_String

    @Override
    public String toString() {
        return "Microwave{" +
                "Range='" + Range + '\'' +
                '}';
    }
}
