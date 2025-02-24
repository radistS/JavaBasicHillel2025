package lec_10.finalExample;

public abstract class Person {
    private String name;
    private final int age = 18;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    abstract void print(String srt);

}
