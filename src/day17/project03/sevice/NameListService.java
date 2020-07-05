package day17.project03.sevice;

import day17.project03.domain.*;

/**
 * 功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * 说明：
 * employees用来保存公司所有员工对象
 * NameListService()构造器：
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
 * 将对象存于数组中
 * Data类位于day17/project03/sevice/Data.java包中
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        Employee[] emps = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            // 获取第i个Equipment(e),并赋值给equipment
            Equipment equipment = null;
            String[] e = Data.EQUIPMENTS[i];
            if (e.length == 3) {
                int type = Integer.parseInt(e[0]);
                if (type == Data.PC) {
                    equipment = new PC(e[1], e[2]);
                } else if (type == Data.NOTEBOOK) {
                    equipment = new NoteBook(e[1], Double.parseDouble(e[2]));
                } else if (type == Data.PRINTER) {
                    equipment = new Printer(e[0], e[1]);
                }
            }
            ;
            // 获取第i个employee
            String[] emp = Data.EMPLOYEES[i];
            int empType = Integer.parseInt(emp[0]);
            int id = Integer.parseInt(emp[1]);
            String name = emp[2];
            int age = Integer.parseInt(emp[3]);
            double salary = Double.parseDouble(emp[4]);

            if (empType == Data.EMPLOYEE) {  // Employee
                emps[i] = new Employee(id, name, age, salary);
            } else if (empType == Data.PROGRAMMER) {  // Programmer
                emps[i] = new Programmer(id, name, age, salary, equipment);
            } else if (empType == Data.DESIGNER) {  // Designer
                emps[i] = new Designer(id, name, age, salary, equipment, Double.parseDouble(emp[5]));
            } else if (empType == Data.ARCHITECT) {  // Architect
                emps[i] = new Architect(id, name, age, salary, equipment, Double.parseDouble(emp[5]), Integer.parseInt(emp[6]));
            }
        }
        employees = emps;
    }


    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
            throw new TeamException("找不到指定的员工");
    }


}
