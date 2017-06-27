package yufa.xunhuan;

/**
 * Created by alibeibei on 2017/6/27.
 */
public class TestWhile {
    /**
     * 测试while循环
     */
    public void testWhile() {
        boolean isw = true;
        int count = 0;
        while (isw) {
            System.out.println("1");
            if (count == 100000) {
                isw = false;
                System.out.println("执行完成");
            }
            count++;
        }
    }

    /**
     * do while 循环
     */
    public void testDoWhile() {
        boolean isw = true;
        int count = 0;
        do {
//            if(count==1){
//                break;
//            }
            System.out.println("测试环境");
            if (count == 100000) {
                isw = false;
                System.out.println("执行完成");
            }
            count++;
        } while (isw);
    }


    /**
     * for循环
     */
    public void testFor() {
        for (int x = 10; x < 20; x++) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }

    /**
     * 增强型java for循环
     * for(声明语句 : 表达式)
     * {
     * //代码句子
     * }
     */
    public void testForA() {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }

    /**
     * 测试break关键字
     */
    public void testBreak() {
        int[] numbers = {10, 20, 40, 30, 50};

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        TestWhile testWhile = new TestWhile();
//        testWhile.testWhile();
//        testWhile.testDoWhile();
//        testWhile.testForA();
//        testWhile.testBreak();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
