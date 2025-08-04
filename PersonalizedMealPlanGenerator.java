package Generics;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public String getMealDetails() {
        return "Meal Plan: " + plan.getMealType();
    }
}

public class PersonalizedMealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(Meal<T> meal) {
        System.out.println("Generated: " + meal.getMealDetails());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

        generatePlan(vegMeal);
        generatePlan(ketoMeal);
    }
}
