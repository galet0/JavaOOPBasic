package _04_encapsulation._05_pizzaCalories;

import _04_encapsulation._05_pizzaCalories.models.Dough;
import _04_encapsulation._05_pizzaCalories.models.Pizza;
import _04_encapsulation._05_pizzaCalories.models.Topping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 01.07.2016.
 */
public class Main {
    private static BufferedReader reader;
    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                String result = null;
                String[] input = reader.readLine().split("\\s+");
                if (input[0].equals("END")) {
                    break;
                }
                switch (input[0]) {
                    case "Dough":
                        Dough dough = tryMakeDough(input);
                        result = String.format("%.2f", dough.getCalories());
                        break;
                    case "Topping":
                        Topping topping = tryMakeTopping(input);
                        result = String.format("%.2f", topping.getCalories());
                        break;
                    case "Pizza":
                        Pizza pizza = tryMakePizza(input);
                        result = pizza.toString();
                        break;
                }
                System.out.println(result);
            }
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static Pizza tryMakePizza(String[] input) throws IOException {
        String name = input[1];
        int toppingsCount = Integer.parseInt(input[2]);
        Pizza pizza = new Pizza(name, toppingsCount);
        String[] line = reader.readLine().split("\\s+");
        Dough dough = tryMakeDough(line);
        pizza.setDough(dough);
        for (int i = 0; i < toppingsCount; i++) {
            String[] toppInput = reader.readLine().split("\\s+");
            Topping topping = tryMakeTopping(toppInput);
            pizza.addToppings(topping);
        }

        return pizza;
    }

    private static Topping tryMakeTopping(String[] input) {
        String type = input[1];
        int weight = Integer.parseInt(input[2]);
        Topping topping = new Topping(type, weight);
        return topping;
    }

    private static Dough tryMakeDough(String[] input) {
        String flour = input[1];
        String technique = input[2];
        int weight = Integer.parseInt(input[3]);
        Dough dough = new Dough(flour, technique, weight);
        return dough;
    }
}
