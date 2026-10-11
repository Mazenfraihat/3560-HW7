public class MacronutrientFactory {

    private static MacronutrientFactory instance = null;

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null)
            instance = new MacronutrientFactory();
        return instance;
    }

    public FoodFactory getFactory(String type) {
        switch (type) {
            case "carbs":
                return CarbsFactory.getInstance();
            case "protein":
                return ProteinFactory.getInstance();
            case "fats":
                return FatsFactory.getInstance();
            default:
                return null;
        }
    }

    public Meal createMeal(Customer customer) {
        DietPlan plan = customer.getDietPlan();
        String carb = getFactory("carbs").getFood(plan);
        String protein = getFactory("protein").getFood(plan);
        String fat = getFactory("fats").getFood(plan);
        return new Meal(carb, protein, fat);
    }
}