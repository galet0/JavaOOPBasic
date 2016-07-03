package _01_DefiningClasses._04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class _04_CompanyRosterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        HashMap<String, Double> departmSalary = new HashMap<>();
        HashMap<String, TreeSet<Employee>> departmEmployee = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] employeeData = reader.readLine().split("\\s+");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];
            Employee employee = null;
            if(employeeData.length == 4){
                employee = new Employee(name, salary, position, department);
            } else if(employeeData.length == 5){
                if(isNumber(employeeData[4])){
                    int age = Integer.parseInt(employeeData[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = employeeData[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            } else {
                String email = employeeData[4];
                int age = Integer.parseInt(employeeData[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }

            if(!departmEmployee.containsKey(department)){
                departmEmployee.put(department, new TreeSet<>());
                departmSalary.put(department, 0.0);
            }

            departmEmployee.get(department).add(employee);
            departmSalary.put(department, departmSalary.get(department) + salary);
        }

        Map.Entry<String, TreeSet<Employee>> best = departmEmployee.entrySet().stream()
                .sorted((e1,e2) -> (Double.compare(departmSalary.get(e2.getKey()),departmSalary.get(e1.getKey()))))
                .findFirst().get();

        System.out.printf("Highest Average Salary: %s\n", best.getKey());
        for (Employee employee : best.getValue()) {
            System.out.println(employee);
        }
    }

    private static boolean isNumber(String s) {
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
}
