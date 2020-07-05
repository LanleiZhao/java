package day17.project03.sevice;

import day17.project03.domain.Employee;

public class NameListTest {
    public static void main(String[] args) {
        NameListService test = new NameListService();
        Employee[] allEmployees = test.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }

        System.out.println("=================");
        Employee employee = test.getEmployee(10);
        System.out.println(employee);


    }
}
