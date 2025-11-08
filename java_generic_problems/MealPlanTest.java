interface MealPlan { String getPlan(); }

class VegetarianMeal implements MealPlan { public String getPlan() { return "Vegetarian Plan"; } }
class VeganMeal implements MealPlan { public String getPlan() { return "Vegan Plan"; } }
class KetoMeal implements MealPlan { public String getPlan() { return "Keto Plan"; } }

class Meal<T extends MealPlan> {
    private T meal;
    Meal(T meal) { this.meal = meal; }
    public void showPlan() { System.out.println(meal.getPlan()); }
}

public class MealPlanTest {
    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated: " + plan.getPlan());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        veg.showPlan();

        generatePlan(new KetoMeal());
    }
}
