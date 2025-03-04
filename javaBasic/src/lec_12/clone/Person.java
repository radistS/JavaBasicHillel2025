package lec_12.clone;

import java.util.Collection;

public class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Поверхневе клонування
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Глибоке клонування
    public Person deepClone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        return clonedPerson;
    }
}
