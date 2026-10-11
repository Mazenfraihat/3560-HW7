public class Meal {

    private String carb;
    private String protein;
    private String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public String toString() {
        return "Carbs: " + carb + ", Protein: " + protein + ", Fats: " + fat;
    }
}