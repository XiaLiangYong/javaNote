package yufa.extend;

/**
 * 继承
 * Created by alibeibei on 2017/6/16.
 */
public class Chinese extends People {

    /**
     * static 优先 然后是父类的构造函数接着子类的构造函数
     */
    static {
        System.out.println("this ia a static\n");
    }

    public Chinese() {
        System.out.println("chinese\n");
    }

    public static void main(String[] args) {
        //由此可见 new 相同的类，其内存地址是不同的
        Chinese chinese = new Chinese();
        System.out.println(chinese);

        Chinese chinese2 = new Chinese();

        System.out.println(chinese2);
    }

    public void name() {
        System.out.println("my is a chinese\n");
    }
}
