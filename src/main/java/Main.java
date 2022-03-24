import house.Dishwasher;
import house.HomeAppliances;

public class Main {
    public static void main(String[] args) {
        HomeAppliances myDishCleaner = new HomeAppliances("Whirpool","KithenAid","Steel","Standard","899",120,50);
        System.out.println(myDishCleaner.getBodyType());

    }
}
