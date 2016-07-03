package _02_Methods._12_printPeople;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 29.06.2016.
 */
public class PrintPeopleMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> nameAge = new HashMap<>();
        HashMap<String,List<Person>> namePerson = new HashMap<>();
        Person person = null;
        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("END")){
                break;
            }
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String occupation = input[2];

            person = new Person(name, age, occupation);
            if(!nameAge.containsKey(name)){
                nameAge.put(name, age);
                namePerson.put(name, new ArrayList<>());
            }
            namePerson.get(name).add(person);
        }

//        Map.Entry<String, List<Person>> younger = namePerson.entrySet().stream()
//                .sorted((p1,p2) -> Integer.compare(nameAge.get(p1.getKey()),nameAge.get(p2.getKey())))
//                .forEach(people -> );
//        for (Person person1 : younger.getValue()) {
//            System.out.println(person1);
//        }
    }
}
