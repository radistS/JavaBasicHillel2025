package lec_13.ex;

public class Ex1 {
    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.getCount());
//        System.out.println(s.count);
    }
}

class Salmon{
    private int count; // private

    public Salmon() {
        this.count = 4;
    }

    public int getCount() {
        return count;
    }
}
