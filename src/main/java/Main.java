import house.Dishwasher;
import house.Dryer;
import house.HomeAppliances;

public class Main {
    public static void main(String[] args) {
        HomeAppliances myDishWasher1 = new HomeAppliances("Whirpool", "KithenAid", "Steel", "Standard", 899, 120, 50);
        System.out.println(myDishWasher1.getBodyType());

        HomeAppliances nyDryer1 = new HomeAppliances("Samsumg", "W550", "Metal", "Standard", 1000, 250, 50);


    }
}
