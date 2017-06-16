package yufa.PrimitiveType;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class test {
    public static void main(String[] args) {
        double ch = (float) 214748;
        System.out.println(ch);
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);
        //int  浮点数到整数的转换是通过舍弃小数得到，不是四舍五入
        System.out.println((int) 23.7 == 23);
        System.out.println((int) -45.89f == -45);


    }
}
