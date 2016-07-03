package _04_encapsulation._04_shoppingSpree;

/**
 * Created by User on 01.07.2016.
 */
public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    private void setName(String name) {
        if(name.isEmpty() || name.trim().length() == 0){
            throw new IllegalArgumentException("Name cannot be an empty string.");
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if(cost < 0){
            throw  new IllegalArgumentException("Money cannot be a negative number.");
        }
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
