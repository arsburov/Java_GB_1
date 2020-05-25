package ru.geekbrains.lesson05;

public class Main {

    public static void main(String[] args) {
        makeArrayAndPrintEmployeeInfo();
    }

    static void makeArrayAndPrintEmployeeInfo(){
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Petrov Ivan Ivanovich", "Head office", "petrov@google.com", "8-901-010-10-10", 300000, 32);
        employeesArray[1] = new Employee("Ivanov Ivan Ivanovich", "CTO", "ivanov@google.com", "8-922-012-12-12", 250000, 42);
        employeesArray[2] = new Employee("Sidorov Ivan Petrovich", "Software engineer", "sidorov@google.com", "8-901-030-30-30", 150000, 22);
        employeesArray[3] = new Employee("Javov Petr Ivanovich", "Sales manager", "javov@google.com", "8-901-510-15-15", 125000, 43);
        employeesArray[4] = new Employee("Pythonov Petr Petrovich", "Team lead", "pythonov@google.com", "8-921-700-70-70", 200000, 42);

        int j = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40){
                employeesArray[i].printEmployeeInfo();
                j++;
            }
        }
        if (j == 0){
            System.out.println("No employee older then 40 years");
        }
    }
}
