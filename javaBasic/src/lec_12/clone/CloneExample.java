package lec_12.clone;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Київ");
        Person original = new Person("Олександр", address);

        // Виконуємо поверхневе клонування
        Person shallowClone = (Person) original.clone();

        // Виконуємо глибоке клонування
        Person deepClone = original.deepClone();

        // Змінюємо адресу в оригіналі
        original.address.city = "Львів";

        // Виводимо результати
        System.out.println("Оригінал: " + original.address.city);
        System.out.println("Поверхневе клонування: " + shallowClone.address.city); // Львів, оскільки це посилання на той самий об'єкт
        System.out.println("Глибоке клонування: " + deepClone.address.city); // Київ, оскільки це новий об'єкт
    }
}
