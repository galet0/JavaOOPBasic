package _03_staticMembers._01_studentsName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 27.06.2016.
 */
public class StudentsMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String name = reader.readLine();
            if(name.equals("End")){
                break;
            }
            Students student = new Students(name);
            Students.getCountStudents();
        }
        System.out.println(Students.getCountStudents());
    }
}
