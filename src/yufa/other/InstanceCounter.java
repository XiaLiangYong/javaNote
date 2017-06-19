package yufa.other;

/**
 * Created by alibeibei on 2017/6/19.
 */
public class InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter();
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
        InstanceCounter ins = new InstanceCounter();
        System.out.println(ins.numInstances);
        System.out.println(InstanceCounter.numInstances);
    }
}
