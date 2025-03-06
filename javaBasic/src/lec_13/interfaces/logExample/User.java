package lec_13.interfaces.logExample;

public class User implements Logger {
    private String fullName;

    @Override
    public void printLog(String msg) {
        System.out.println("User : " + fullName + " ... " + msg);
    }

    @Override
    public String xxx() {
        System.out.println("nothing do...");
        return null;
    }

    @Override
    public void print() {
        System.out.println("override default method ...");
    }
}
