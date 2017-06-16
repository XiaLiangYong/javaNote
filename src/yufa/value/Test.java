package yufa.value;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class Test {
    int a, b, c;         // 声明三个int型整数：a、 b、c
    int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
    byte z = 22;         // 声明并初始化 z
    String s = "runoob";  // 声明并初始化字符串 s
    double pi = 3.14159; // 声明了双精度浮点型变量 pi
    char x = 'x';        // 声明变量 x 的值是字符 'x'。

    public void pupAge() {
        int age = 0;
        age += 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
