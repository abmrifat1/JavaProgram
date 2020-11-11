package class_practice;

public class CallByRef {
    String name;

    void change(CallByRef ref) {
        ref.name = "ars";
    }
}

class CallByRefTest {
    public static void main(String[] args) {
        CallByRef cl = new CallByRef();
        cl.name = "abm";
        System.out.println("from test:"+ cl.name);
        cl.change(cl);
        System.out.println("from main class:"+ cl.name);
    }
}
