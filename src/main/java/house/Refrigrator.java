package house;

public class Refrigrator extends HomeAppliances{
    int doors;

    // Constructors

    public Refrigrator(String make, String model, String bodyType, String plugType, int price, int voltageNeed, int weight, int doors) {
        super(make, model, bodyType, plugType, price, voltageNeed, weight);
        this.doors = doors;
    }

    public Refrigrator(int doors) {
        this.doors = doors;
    }

    //Getters and Setters


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Methods

    //To_String

    @Override
    public String toString() {
        return "Refrigrator{" +
                "doors=" + doors +
                '}';
    }
}
