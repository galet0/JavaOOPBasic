package _01_DefiningClasses._01_DefiningClassPerson;

import java.lang.reflect.Field;

class Person {
    String name;
    int age;
}

public class _01_DefineClassPerson {
    public static void main(String[] args) {
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
        Person pesho = new Person();
        Person gosho = new Person();
        pesho.name = "Pesho";
        pesho.age = 19;
        gosho.name = "Gosho";
        gosho.age = 20;

        System.out.println(pesho.name + " " + pesho.age);
        System.out.println(gosho.name + " " + gosho.age);
    }
}
