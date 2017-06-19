package yufa.other;

/**
 * Created by alibeibei on 2017/6/19.
 */
public class SuperClassDemo extends SuperClass {
    @Override
    void m() {
        System.out.println("我是abstract抽象方法的实现");
    }

    public static void main(String[] args) {
        SuperClass demo = new SuperClassDemo();
        demo.m();
    }
}
