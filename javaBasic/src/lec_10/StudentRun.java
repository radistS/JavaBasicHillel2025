package lec_10;

public class StudentRun {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.toString());

        st.setFirstName("Oleksandr");
        st.setLastName("Stepurko");
        st.setAge(15);

        System.out.println(st);

        Student sr2 = new Student("Ivan", "Ivanov", 12 );
        System.out.println(sr2);
    }
}
