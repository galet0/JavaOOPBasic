package _02_Methods._02_OldestFamilyMember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * Created by User on 26.06.2016.
 */
public class OldestFamilyMemberMain {
    public static void main(String[] args) throws IOException, NoSuchMethodException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Family family = new Family();

        Person person = null;
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            Integer age = Integer.parseInt(input[1]);

            person = new Person(name,age);
            family.addFamilyMember(person);
        }
        System.out.printf("%s %d\n",
                family.getOldestMember().getName(),
                family.getOldestMember().getAge());

        Method getOldestMethod = Family.class.getMethod("getOldestMember");
        Method addMemberMethod = Family.class.getMethod("addFamilyMember",Person.class);


    }
}
