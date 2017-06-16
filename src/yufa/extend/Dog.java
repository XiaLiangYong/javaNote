package yufa.extend;

/**
 * Created by alibeibei on 2017/6/16.
 */
public class Dog extends Animal {
    String breed;
    int age = 1;
    String color;

    void barking() {
        super.name();
    }

    void hungry() {

    }

    void sleeping() {

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name();
    }
}
