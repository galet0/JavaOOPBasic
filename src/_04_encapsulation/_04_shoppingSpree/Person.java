package _04_encapsulation._04_shoppingSpree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 01.07.2016.
 */
public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    private void setName(String name) {
        if(name.isEmpty() || name.trim().length() == 0){
            throw new IllegalArgumentException("Name cannot be an empty string.");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be a negative number.");
        }
        this.money = money;
    }

    public void boughtProduct(Product product){
        if(product.getCost() > this.money){
            System.out.printf("%s can't afford %s\n",this.name, product.getName());
        } else {
            bagOfProducts.add(product);
            this.money -= product.getCost();
            System.out.printf("%s bought %s\n",this.name, product.getName());
        }
    }

    @Override
    public String toString() {
        if(bagOfProducts.size() > 0){
            StringBuilder sb = new StringBuilder(bagOfProducts.toString());
            return String.format("%s - %s", this.name, sb.toString().substring(1, sb.length() - 1));
        } else {
            return String.format("%s - Nothing bought", this.name);
        }
    }
}
