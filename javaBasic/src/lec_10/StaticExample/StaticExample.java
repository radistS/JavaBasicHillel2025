package lec_10.StaticExample;

public class StaticExample {
    private  static  String name = "Name";
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticExample.name = name;
    }

    public static void print(){
        System.out.println(name);
    }


}
