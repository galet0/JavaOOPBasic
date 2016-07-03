package _02_Methods._09_PizzaTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PizzaTimeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        Pizza pizzaCLass = new Pizza();
        pizzaCLass.addPizzas(input);
        Map<Integer, StringBuilder> pizzas = pizzaCLass.getPizzaList();

        pizzas.entrySet()
                .stream()
                .sorted((gr1, gr2) -> Integer.compare(gr1.getKey(),gr2.getKey()))
                .forEach(group -> {
                    System.out.printf("%d - %s\n", group.getKey(), group.getValue()
                        .substring(0, group.getValue().length() -2));
                });

        Class<?> pizzaClass = Pizza.class;
        Method[] methods = pizzaClass.getDeclaredMethods();
        List<Method> checkedMethods = Arrays.stream(methods)
                .filter(m -> m.getReturnType().getName().contains("Map"))
                .collect(Collectors.toList());

        if (checkedMethods.size() < 1) {
            throw new ClassFormatError();
        }



    }

}
