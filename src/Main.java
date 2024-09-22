package Models;

public class Main {

    public static void main(String[] args) {

        // Create Food Items for the Menu
        FoodItems pizza = new FoodItems("Pizza", 1200, "A Crispy Pizza with a Crispy Texture and Great Sauce.");
        FoodItems burger = new FoodItems("Burger", 550, "A Chicken burger with Lettuce and Tomato and Chef's Special Sauce.");
        FoodItems momo = new FoodItems("Mo:Mo", 150, "A Nepali Specialty with Dumplings of a Rich Filling.");
        FoodItems chickenChilly = new FoodItems("Chicken Chilly", 850, "Crispy Chicken Wings and Drums coated in our Chilly Sauce.");

        // MENU CREATION
        Menu foodMenu = new Menu("Lunch");
        foodMenu.addFoodItems(pizza);
        foodMenu.addFoodItems(burger);
        foodMenu.addFoodItems(momo);
        foodMenu.addFoodItems(chickenChilly);

        // MENU DISPLAY

        System.out.println("---- Menu ----");
        foodMenu.displayMenu();

        // EMPLOYEE OBJECT DECLARATION

        Chef chef = new Chef("Gordon Ramsay", "Chef", "123 Chef Street", "chefgordon@gmail.com", 1234, "Pizza");
        SousChef sousChef = new SousChef("Nick DiGiovanni", "Sous Chef", "123 Sous Chef Street", "souschefnick@gmail.com", 5678, "Burger", 5);
        Waiter waiter1 = new Waiter("Pigs", "Waiter", "123 Waiter Street", "waiterpigs@gmail.com", 1987, 3);
        Manager manager = new Manager("Marco Pierre White", "Manager", "123 Waiter Street", "managermarco@gmail.com", 9012, 10);

        // MANAGER AND EMPLOYEE INFO

        System.out.println("\n---- Employee Info ----");

        chef.displayInfo();
        sousChef.displayInfo();
        waiter1.displayInfo();
        manager.displayInfo();

        // EMPLOYEES' JOBS

        System.out.println("\n---- Employee Jobs ----");
        chef.cookDish();
        sousChef.assistChef();
        waiter1.serveCustomer();
        manager.scheduleEmployees();
    }
}
