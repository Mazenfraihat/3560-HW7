public class PizzaDriver {

    public static void main(String[] args) {

        Pizza small = new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.SMALL)
                .addPepperoni().addMushrooms().addOlives()
                .build();

        Pizza medium = new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.MEDIUM)
                .addSausage().addBacon().addOnions()
                .addExtraCheese().addPeppers().addChicken()
                .build();

        Pizza large = new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.LARGE)
                .addPepperoni().addSausage().addMushrooms()
                .addBacon().addOnions().addExtraCheese()
                .addPeppers().addBeef().addHam()
                .build();

        small.eat();
        medium.eat();
        large.eat();

        Pizza hutLarge = new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.LARGE)
                .addChicken().addSpinach().addPesto()
                .build();

        Pizza hutSmall = new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.SMALL)
                .addPepperoni().addExtraCheese()
                .build();

        Pizza caesarsMedium = new Pizza.PizzaBuilder("Little Caesars", Pizza.Size.MEDIUM)
                .addPepperoni().addSausage().addMushrooms().addBacon()
                .addOnions().addPeppers().addOlives().addBeef()
                .build();

        Pizza caesarsSmall = new Pizza.PizzaBuilder("Little Caesars", Pizza.Size.SMALL)
                .addChicken().addSpinach().addTomatoAndBasil()
                .addPesto().addOnions().addExtraCheese()
                .build();

        Pizza dominosSmall = new Pizza.PizzaBuilder("Dominos", Pizza.Size.SMALL)
                .addHamAndPineapple()
                .build();

        Pizza dominosLarge = new Pizza.PizzaBuilder("Dominos", Pizza.Size.LARGE)
                .addSpicyPork().addPeppers().addOnions()
                .build();

        hutLarge.eat();
        hutSmall.eat();
        caesarsMedium.eat();
        caesarsSmall.eat();
        dominosSmall.eat();
        dominosLarge.eat();
    }
}