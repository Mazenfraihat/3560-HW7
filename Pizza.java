import java.util.ArrayList;

public class Pizza {

    public enum Size { SMALL, MEDIUM, LARGE }

    private String chain;
    private Size size;
    private ArrayList<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println(chain + " " + size + " pizza");
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println();
    }

    public static class PizzaBuilder {

        private String chain;
        private Size size;
        private ArrayList<String> toppings = new ArrayList<>();

        public PizzaBuilder(String chain, Size size) {
            this.chain = chain;
            this.size = size;
        }

        public PizzaBuilder addPepperoni() {
            toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder addSausage() {
            toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder addMushrooms() {
            toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder addBacon() {
            toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder addOnions() {
            toppings.add("Onions");
            return this;
        }

        public PizzaBuilder addExtraCheese() {
            toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder addPeppers() {
            toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder addChicken() {
            toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder addOlives() {
            toppings.add("Olives");
            return this;
        }

        public PizzaBuilder addSpinach() {
            toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder addTomatoAndBasil() {
            toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder addBeef() {
            toppings.add("Beef");
            return this;
        }

        public PizzaBuilder addHam() {
            toppings.add("Ham");
            return this;
        }

        public PizzaBuilder addPesto() {
            toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder addSpicyPork() {
            toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder addHamAndPineapple() {
            toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}