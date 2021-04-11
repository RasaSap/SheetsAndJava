package jsonToJava_test;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main_serialize {
    public static void main(String args[]) {

        List<String> names1 = new ArrayList<>();
        names1.add("Saule");
        names1.add("Marija");

        List<String> names2 = new ArrayList<>();
        names1.add("Saule");
        names1.add("Marija");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(
                1001,names1,
                "Krispo",
                "r@ggg.com",
                (new EmployeeAddress("Bitenu str.", "5", "Vilnius", "Lithuania"))));
        employees.add(new Employee(
                1002,names1,
                "Krispo",
                "r@ggg.com",
                (new EmployeeAddress("Bitenu str.", "5", "Vilnius", "Lithuania"))));

        Department departmentObj = new Department(
                "Finance",
                employees
        );

        Gson gson = new Gson();
        String departmentInfoJson = gson.toJson(departmentObj);
        System.out.println(departmentInfoJson);
    }
}