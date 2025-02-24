package lec_10.finalExample;

public final class Student extends Person {

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    void print(String srt) {
        System.out.println(srt);
    }
}
