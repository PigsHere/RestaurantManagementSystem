package Models;

public class FoodItems {

    // FOOD INFORMATION

    private String foodName;
    private double foodPrice;
    private String foodInfo;

    public FoodItems(String foodName, double foodPrice, String foodInfo) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodInfo = foodInfo;
    }

    // FOOD DETAILS DISPLAY

    public String displayInfo() {
        return "Item: " + foodName + " | Price: Rs. " + foodPrice + " | Info: " + foodInfo;
    }

    // GETTER SECTION

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    // SETTER SECTION

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }
}
