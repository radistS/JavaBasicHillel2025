package lec_13.interfaces;

public class Engl implements Say{
    @Override
    public void sayHello() {
        System.out.println("Say hello ...");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("Goodbuy ...");
    }

    public void sayGoodBuy(String name){
        System.out.println("Goodbuy " + name);
    }
}
