package yufa.other;

/**
 * Created by alibeibei on 2017/6/19.
 */
public class ProtectedTest {
    protected String str = "我是protected";
    private String str2 = "我是private";

    protected void demo() {

    }

    public final void demo2() {
        System.out.println("protected Demo2");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
