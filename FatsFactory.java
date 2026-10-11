import java.util.ArrayList;
import java.util.Random;

public class FatsFactory implements FoodFactory {

    private static FatsFactory instance = null;
    private Random random = new Random();

    private FatsFactory() {}

    public static FatsFactory getInstance() {
        if (instance == null)
            instance = new FatsFactory();
        return instance;
    }

    public String getFood(DietPlan plan) {
        ArrayList<String> options = new ArrayList<>();
        options.add("Avocado");
        options.add("Sour cream");
        options.add("Tuna");
        options.add("Peanuts");

        if (plan == DietPlan.PALEO) {
            options.remove("Sour cream");
        }
        if (plan == DietPlan.VEGAN) {
            options.remove("Sour cream");
            options.remove("Tuna");
        }
        if (plan == DietPlan.NUT_ALLERGY) {
            options.remove("Peanuts");
        }

        return options.get(random.nextInt(options.size()));
    }
}