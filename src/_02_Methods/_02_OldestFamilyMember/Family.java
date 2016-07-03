package _02_Methods._02_OldestFamilyMember;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Family {
    List<Person> people;

    public Family() {
        this.people = new ArrayList<>();
    }

    public void addFamilyMember(Person member){
        people.add(member);
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person getOldestMember(){
        List<Person> buffer = people.stream()
                .sorted((p1,p2) -> Integer.compare(p2.getAge(),p1.getAge()))
                .collect(Collectors.toList());
        return buffer.get(0);
    }
}
