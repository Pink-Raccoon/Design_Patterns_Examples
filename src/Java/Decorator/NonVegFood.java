package Java.Decorator;

/**
 * This is a concrete class
 */
public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() + " With roasted Chicken and Chicken Curry";
    }

    public double foodPrice(){
        return super.foodPrice() + 150.0;
    }
}
