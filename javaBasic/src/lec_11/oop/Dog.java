package lec_11.oop;

public class Dog extends Animal{

    // polimorphism
    @Override
    public void eat() {
        System.out.println(String.format("dog %s : eat", getFullName()));
    }

    // incapsulation
    private String getFullName(){
        return super.getName() + ":" + super.getBreed();
    }
}
