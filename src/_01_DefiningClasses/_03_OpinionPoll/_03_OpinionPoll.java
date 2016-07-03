package _01_DefiningClasses._03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    Person(int age){
        this("No name",age);
    }

    Person(){
        this.name = "No name";
        this.age = 1;
    }
}
public class _03_OpinionPoll {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        TreeMap<String,Integer> persons = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] names = reader.readLine().split(" ");
            Person person = new Person(names[0],Integer.parseInt(names[1]));
            if(person.age > 30){
                persons.put(names[0],Integer.parseInt(names[1]));
            }

        }
        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
