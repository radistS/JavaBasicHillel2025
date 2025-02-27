package lec_11.ex;

/*
Створіть клас Employee, що містить ім'я, посаду та зарплату.
Напишіть метод increaseSalary(double percent), який збільшує зарплату на певний відсоток.
 */

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent) {
        salary += salary * percent;
    }

    public void increaseSalary(int percent) {
        salary += salary * (double) percent / 100;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
