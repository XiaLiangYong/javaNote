package yufa.modifier;

import yufa.extend.Dog;
import yufa.other.DefaultDemo;
import yufa.other.DefaultTest;
import yufa.other.ProtectedTest;

/**
 * Created by alibeibei on 2017/6/19.
 */
public class Test {
    String str = "Hello world";

    public Test() {
        Demo demo = new Demo();
        System.out.println(demo);
    }

    /**
     * 修饰符    当前类   同一包内  子孙类   其他包
     * public     Y         Y        Y        Y
     * protected  Y         Y        Y        N
     * default    Y         Y        Y        N
     * private    Y         N        N        N
     */
    public static void main(String[] args) {
        //public
        Test test = new Test();
        System.out.println("public 当前类访问：" + test.str);
        Demo demo = new Demo();
        Dog dog = new Dog();
        System.out.println(dog);

        //protected 由此可见 protected在其他包和子孙类不能访问
        ProtectedTest protest = new ProtectedTest();
        DefaultTest demo2 = new DefaultDemo();

    }
}
