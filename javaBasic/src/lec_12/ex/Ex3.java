package lec_12.ex;

public class Ex3 {
    public static void show() {
        System.out.println("Static method called");
    }

    public void print(){
        System.out.println("Print method called");
    }

    public static void main(String[] args) {
        Ex3.show(); // static

        Ex3 obj = null; // no Object
        obj.show();

        show();

        Ex3 e = new Ex3();
        e.show();
    }
}
