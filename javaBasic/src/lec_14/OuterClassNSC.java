package lec_14;

public class OuterClassNSC {
    private static String staticField = "Статичне поле";
    private  String nostaticFild = "nsf";

    public static class NestedStaticClass {
        public static void display() {
            // Доступ лише до статичних членів зовнішнього класу
            System.out.println("Accessing: " + staticField);
        }
    }

    public static void main(String[] args) {
        NestedStaticClass.display();
    }
}

