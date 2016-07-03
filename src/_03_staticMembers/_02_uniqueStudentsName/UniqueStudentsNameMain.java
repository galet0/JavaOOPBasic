package _03_staticMembers._02_uniqueStudentsName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by User on 27.06.2016.
 */
public class UniqueStudentsNameMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> groups = new HashSet<>();
        while (true) {
            String name = reader.readLine();
            if(name.equals("End")){
                break;
            }
            Student student = new Student(name);
            groups.add(student.getName());
            StudentGroup uniqueNames = new StudentGroup(groups);
        }
        System.out.println(StudentGroup.getCountUniqueStudents());
    }
}
