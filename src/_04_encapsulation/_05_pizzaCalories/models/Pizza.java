package _04_encapsulation._05_pizzaCalories.models;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 01.07.2016.
 */
public class Pizza {
    private String name;
    private Dough dough;
    private int toppingsCount;
    private List<Topping> toppings;

    public Pizza(String name, int toppingsCount) {
        this.setName(name);
        this.setToppingsCount(toppingsCount);
        this.toppings = new LinkedList<>();
    }

    public double getTotalCalories(){
        double total = this.dough.getCalories();
        for (Topping topping : toppings) {
            total += topping.getCalories();
        }
        return total;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addToppings(Topping topping){
        this.toppings.add(topping);
    }

    private void setName(String name) {
        if(name == null || name.trim().length() == 0 || name.length() > 15){
            throw new IllegalArgumentException(String.format("Pizza name should be between 1 and 15 symbols."));
        }
        this.name = name;
    }

    private void setToppingsCount(int toppingsCount) {
        if(toppingsCount > 10  || toppingsCount < 0){
            throw new IllegalArgumentException(String.format("Number of toppings should be in range [0..10]."));
        }
        this.toppingsCount = toppingsCount;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f Calories.", this.name, this.getTotalCalories());
    }
}
