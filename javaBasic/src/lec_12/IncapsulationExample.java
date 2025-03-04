package lec_12;

public class IncapsulationExample {
    private String name;
    private int age;

    public IncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
