package _02_Methods._12_printPeople;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.06.2016.
 */
public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private String occupation;
    private List<Person> personList;

    public Person(String name, Integer age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.personList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return String.format("%s - age: %d, occupation: %s",this.name, this.age, this.occupation);
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(person.age, this.age);
    }
}
