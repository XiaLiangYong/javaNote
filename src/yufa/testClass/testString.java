package yufa.testClass;

/**
 * Created by alibeibei on 2017/6/27.
 */
public class testString {
    String greeting = "菜鸟教程";

    public static void main(String[] args) {
        testString testString = new testString();
        System.out.println(testString.greeting);
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}
