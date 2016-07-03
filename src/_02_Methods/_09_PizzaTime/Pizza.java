package _02_Methods._09_PizzaTime;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pizza {
    private Map<Integer, StringBuilder> pizzaList;

    public Pizza() {
        this.pizzaList = new LinkedHashMap<>();
    }



    public void addPizzas(String... input){
        String regex = "(\\d+)(.*)";
        Pattern pattern = Pattern.compile(regex);

        for (String str : input) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()){
                Integer group = Integer.parseInt(matcher.group(1));
                String name = matcher.group(2);
                if(!pizzaList.containsKey(group)){
                    pizzaList.put(group, new StringBuilder());
                }
                pizzaList.get(group).append(name + ", ");
            }
        }
    }

    public Map<Integer, StringBuilder> getPizzaList() {
        return this.pizzaList;
    }

}
