package Coutsework;

import static Coutsework.Main.employees;

public class Employee {
    private String employee;
    private int department;
    private float salary;
    private static int counter=1;
    private static int id;

    //Геттеры
    public int getId() {return id;}
    public String getEmployee() {return employee;}
    public int getDepartment() {return department;}
    public float getSalary() {return salary;}

    //Сеттеры
    public void setEmployee(String employee) { this.employee = employee; }
    public void setDepartment(int department) { this.department = department; }
    public void setSalary(float salary) { this.salary = salary; }

    //Конструктор
    public Employee(String employee, int department, float salary) {
        this.employee = employee;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    @Override
    public String toString() {
        return id + " Сотрудник: " + employee + " Отдел: " + department + " Заработная плата: " + salary;
    }

}
