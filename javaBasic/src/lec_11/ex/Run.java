package lec_11.ex;

public class Run {
    public static void main(String[] args) {

        // calculate Rectangle
        Rectangle rect = new Rectangle(2,5);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

        Rectangle sq = new Rectangle(2, 2);
        System.out.println(sq.calculateArea());
        System.out.println(sq.calculatePerimeter());


        // increaseSalary
        Employee empl = new Employee("Oleksand", "Java dev", 10000);
        System.out.println(empl.getSalary());
        empl.increaseSalary(0.5d);
        System.out.println(empl.getSalary());
        empl.increaseSalary(50);
        System.out.println(empl.getSalary());


        // Triangle validation
        Triangle triangle = new Triangle(2, 3, 3);
        System.out.println(triangle.isValid());

        Employee empl1 = new Employee("Oleksandr", "Java dev", 10000);

        EmployeeSalary es = new EmployeeSalary();

        es.increaseSalary(empl1, 0.10d);

        System.out.println(empl1.getSalary());


    }
}
