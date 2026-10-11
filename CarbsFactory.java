import java.util.ArrayList;
import java.util.Random;

public class CarbsFactory implements FoodFactory {

    private static CarbsFactory instance = null;
    private Random random = new Random();

    private CarbsFactory() {}

    public static CarbsFactory getInstance() {
        if (instance == null)
            instance = new CarbsFactory();
        return instance;
    }

    public String getFood(DietPlan plan) {
        ArrayList<String> options = new ArrayList<>();
        options.add("Cheese");
        options.add("Bread");
        options.add("Lentils");
        options.add("Pistachio");

        if (plan == DietPlan.PALEO) {
            options.remove("Cheese");
            options.remove("Bread");
            options.remove("Lentils");
        }
        if (plan == DietPlan.VEGAN) {
            options.remove("Cheese");
        }
        if (plan == DietPlan.NUT_ALLERGY) {
            options.remove("Pistachio");
        }

        return options.get(random.nextInt(options.size()));
    }
}