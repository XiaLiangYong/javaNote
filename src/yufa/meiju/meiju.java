package yufa.meiju;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class meiju {
    /**
     * 主函数 整个java程序的入口
     *
     * @param args
     */
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice.size);
    }
}
