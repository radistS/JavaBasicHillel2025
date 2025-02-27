package lec_11.ex;

/*
Створіть клас Employee, що містить ім'я, посаду та зарплату.
Напишіть метод increaseSalary(double percent), який збільшує зарплату на певний відсоток.
 */

public class EmployeeSalary {
    public void increaseSalary(Employee employee, double percent) {
        employee.setSalary(employee.getSalary() + employee.getSalary() * percent);
    }
}
