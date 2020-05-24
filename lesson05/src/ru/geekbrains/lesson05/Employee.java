package ru.geekbrains.lesson05;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo(){
        System.out.println(String.format("Employee full name: %s \nPosition: %s \nEmail: %s \nPhone number: %s \nSalary: %d \nAge: %d \n", fullName, position, email, phoneNumber, salary, age));
    }
}
