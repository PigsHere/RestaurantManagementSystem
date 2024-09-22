package Models;

import java.util.ArrayList;

public class Menu {

    private String menuName;
    private ArrayList<FoodItems> menuItems;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.menuItems = new ArrayList<>();
    }

    // MENU FOOD ADDING

    public void addFoodItems(FoodItems item) {
        this.menuItems.add(item);
    }

    // MENU PRINTING

    public void displayMenu() {
        System.out.println(menuName + " Menu:");
        for (FoodItems item : menuItems) {
            System.out.println(item.displayInfo());
        }
    }

    // GETTER SECTION

    public String getMenuName() {
        return menuName;
    }

    public ArrayList<FoodItems> getMenuItems() {
        return menuItems;
    }

    // SETTER SECTION

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuItems(ArrayList<FoodItems> menuItems) {
        this.menuItems = menuItems;
    }
}
