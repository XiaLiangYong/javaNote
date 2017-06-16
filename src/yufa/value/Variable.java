package yufa.value;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class Variable {
    static int allClicks = 1;    // 类变量

    String str = "this ia a bianliang";  // 实例变量

    public int method() {
        int i = 0;  // 局部变量
        return 1;
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        System.out.println(variable.str);
        System.out.println(variable.method());
        System.out.println(Variable.allClicks);
        System.out.println(variable.allClicks);
    }
}
