package _05_inheritance._03_mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 03.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String[] studentTokens = reader.readLine().split("\\s+");
            //Student student = tryMakeStudent(studentTokens);
            String firstNameStudent = studentTokens[0];
            String lastNameStudent = studentTokens[1];
            String facultyNumber = studentTokens[2];
            Student student = new Student(firstNameStudent, lastNameStudent, facultyNumber);

            String[] workerTokens = reader.readLine().split("\\s+");
            //Worker worker = tryMakeWorker(workerTokens);
            String firstNameWorker = workerTokens[0];
            String lastNameWorker = workerTokens[1];
            double weekSalary = Double.parseDouble(workerTokens[2]);
            int workingHours = Integer.parseInt(workerTokens[3]);
            Worker worker = new Worker(firstNameWorker, lastNameWorker, weekSalary, workingHours);

            System.out.println(student);
            System.out.println(worker);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }

//    private static Worker tryMakeWorker(String[] workerTokens) {
//        String firstNameWorker = workerTokens[0];
//        String lastNameWorker = workerTokens[1];
//        double weekSalary = Double.parseDouble(workerTokens[2]);
//        int workingHours = Integer.parseInt(workerTokens[3]);
//        Worker worker = new Worker(firstNameWorker, lastNameWorker, weekSalary, workingHours);
//        return worker;
//    }

//    private static Student tryMakeStudent(String[] studentTokens){
//        String firstNameStudent = studentTokens[0];
//        String lastNameStudent = studentTokens[1];
//        String facultyNumber = studentTokens[2];
//        Student student = new Student(firstNameStudent, lastNameStudent, facultyNumber);
//        return student;
//    }


}
