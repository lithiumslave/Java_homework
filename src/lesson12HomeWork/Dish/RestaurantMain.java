package lesson12HomeWork.Dish;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.printMenu();

        rest.selectDish(Dish.BEEF_BURGER);
        rest.selectDish(Dish.TIRAMISU);
        rest.selectDish(Dish.RIBEYE_STAKE);
        
    }
}
