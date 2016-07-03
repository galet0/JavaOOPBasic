package _02_Methods._01_MethodSaysHallo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by User on 26.06.2016.
 */
public class MethodSaysHalloMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Person person = new Person(name);
        System.out.println(person.sayHello(name));

        Field[] fields = Person.class.getDeclaredFields();
        Method[] methods = Person.class.getDeclaredMethods();
        if (fields.length != 1 || methods.length != 1) {
            throw new ClassFormatError();
        }

    }

}
