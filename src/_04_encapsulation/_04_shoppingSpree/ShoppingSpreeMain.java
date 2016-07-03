package _04_encapsulation._04_shoppingSpree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingSpreeMain {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String regex = "([A-Za-z]+)\\s*=\\s*(-*[\\d]+);*";
            String inputPersons = reader.readLine();
            String inputProducts = reader.readLine();

            LinkedHashMap<String, Person> listOfPeople = new LinkedHashMap<>();
            LinkedHashMap<String, Product> listOfProducts = new LinkedHashMap<>();
            Pattern pattern = Pattern.compile(regex);

            Person person = null;
            Product product = null;

            Matcher matcher = pattern.matcher(inputPersons);
            while (matcher.find()) {
                String personName = matcher.group(1);
                double moneyHave = Double.parseDouble(matcher.group(2));
                person = new Person(personName, moneyHave);
                if (!listOfPeople.containsKey(personName)) {
                    listOfPeople.put(personName, person);
                }
            }
            Matcher matcher1 = pattern.matcher(inputProducts);
            while (matcher1.find()) {
                String productName = matcher1.group(1);
                double cost = Double.parseDouble(matcher1.group(2));
                product = new Product(productName, cost);
                if (!listOfProducts.containsKey(productName)) {
                    listOfProducts.put(productName, product);
                }
            }

            while (true) {
                String[] inputTokens = reader.readLine().split("\\s+");
                if (inputTokens[0].equals("END")) {
                    break;
                }
                String personName = inputTokens[0];
                String prodName = inputTokens[1];

                listOfPeople.get(personName).boughtProduct(listOfProducts.get(prodName));
            }

            for (String people : listOfPeople.keySet()) {
                System.out.println(listOfPeople.get(people));
            }
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
