package yufa.PrimitiveType;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class ZiDongLeiZhuan {
    public static void main(String[] args) {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);

        //Java 里使用 long 类型的数据一定要在数值后面加上 L，否则将作为整型解析
        long g = 9223372036854775807L;
        long h = -9223372036854775808L;
        System.out.println(g);
        System.out.println(h);
    }
}
