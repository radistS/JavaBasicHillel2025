package lec_10;

public class MethodExample {

    public void print(String str){
        System.out.println(str);
    }

    public String concatStr(String str1, String str2){
        return str1 + str2;
    }
}

class MethodExampleRun{
    public static void main(String[] args) {
        MethodExample me  = new MethodExample();
        me.print(me.concatStr("a", "b"));
    }
}
