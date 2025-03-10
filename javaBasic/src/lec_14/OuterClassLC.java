package lec_14;

public class OuterClassLC {
    public void performTask() {
        final String taskName = "Local Task";

        class LocalClass {
            void execute() {
                System.out.println("Executing " + taskName);
            }
        }

        LocalClass local = new LocalClass();
        local.execute();
    }

    public static void main(String[] args) {
        OuterClassLC lc  = new OuterClassLC();
        lc.performTask();
    }
}
