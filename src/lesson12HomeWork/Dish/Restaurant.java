package lesson12HomeWork.Dish;

import lesson5HomeWorkCombined.PrintOperations;

public class Restaurant {
    public void printMenu() {
        System.out.println("--------------------------- MENU -------------------------------");
        for (Dish dishToPrint : Dish.values()) {
            System.out.println(dishToPrint.getCategory());
            System.out.println(dishToPrint.getName() + "  " + dishToPrint.getPrice() + " UAH");
            System.out.print("Ingredients: ");
            dishToPrint.ingredients();
            PrintOperations.printSeparator();
        }
    }

    public void selectDish(Dish dish) {
        switch(dish) {
            case BEEF_BURGER:
            case RIBEYE_STAKE:
            case ROAST_BEEF:
            case TIRAMISU:
            case APPLE_PIE: System.out.println("Name of chosen dish: " + dish.getName() + "\nExpected time of preparation: " + dish.getPreparationTime() + "\n"); break;
            default: System.out.println("Sorry, we don't have such fish, please review our menu and choose any other dish!\n"); printMenu();
        }
    }
}
