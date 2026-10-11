public class MealDriver {

    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Ahmad", DietPlan.NO_RESTRICTION),
                new Customer("Sara", DietPlan.PALEO),
                new Customer("Omar", DietPlan.VEGAN),
                new Customer("Lina", DietPlan.NUT_ALLERGY),
                new Customer("Yusuf", DietPlan.PALEO),
                new Customer("Noor", DietPlan.VEGAN)
        };

        MacronutrientFactory factory = MacronutrientFactory.getInstance();

        for (Customer customer : customers) {
            Meal meal = factory.createMeal(customer);
            System.out.println(customer.getName() + " (" + customer.getDietPlan() + ")");
            System.out.println(meal);
            System.out.println();
        }
    }
}