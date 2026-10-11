import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory implements FoodFactory {

    private static ProteinFactory instance = null;
    private Random random = new Random();

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null)
            instance = new ProteinFactory();
        return instance;
    }

    public String getFood(DietPlan plan) {
        ArrayList<String> options = new ArrayList<>();
        options.add("Fish");
        options.add("Chicken");
        options.add("Beef");
        options.add("Tofu");

        if (plan == DietPlan.PALEO) {
            options.remove("Tofu");
        }
        if (plan == DietPlan.VEGAN) {
            options.remove("Fish");
            options.remove("Chicken");
        }

        return options.get(random.nextInt(options.size()));
    }
}