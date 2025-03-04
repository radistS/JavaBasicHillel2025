package lec_12;

public class InheritanceExample {
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Тварина видає звук");
    }
}

// Підклас
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Виклик конструктора суперкласу
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}