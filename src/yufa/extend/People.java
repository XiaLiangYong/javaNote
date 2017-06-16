package yufa.extend;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class People {
    static {
        System.out.println("this ia a static people\n");
    }

    public People() {
        System.out.print("people\n");
    }

    public void name() {
        System.out.print("my is a People");
    }
}
