package yufa.value;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class Employee {
    // 这个实例变量对子类可见

    public String name;
    // 私有变量，仅在该类可见
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setSalary(10000);
    }


}
