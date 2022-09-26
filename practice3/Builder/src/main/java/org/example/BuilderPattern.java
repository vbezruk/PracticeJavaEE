package org.example;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("=== Veg meal ===");
        vegMeal.showItems();
        System.out.printf("Total cost = %.2f$\n================\n", vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("\nNon veg meal:");
        nonVegMeal.showItems();
        System.out.printf("Total cost = %.2f$\n================", nonVegMeal.getCost());
    }
}