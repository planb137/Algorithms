package nuaa.edu.test;

/**
 * @author planb
 * @date 2020/9/7 09:52
 * 备注：继承是一个 "是不是"的关系，而 接口 实现则是 "有没有"的关系。
 * 如果一个类继承了某个抽象类，则子类必定是抽象类的种类，
 * 而接口实现则是有没有、具备不具备的关系，比如狗是否能钻火圈，
 * 能则可以实现这个接口，不能就不实现这个接口。
 */
abstract class AbstractTest {
    abstract int add(int a, int b);

    abstract int add3(int a, int b);

    //抽象类可以有普通方法
    int add2() {
        return 2;
    }
}

//函数式接口，只能有一个抽象方法，可以有多个静态方法
@FunctionalInterface
interface ac {
    abstract int add(int a, int b);

    //可以有多个静态方法
    static int add2(int a,int c) {
        return 5;
    }

    static int add3() {
        return 5;
    }
}

//普通类继承抽象类，必须实现里面所有的抽象方法
class Ac extends AbstractTest {

    @Override
    int add(int a, int b) {
        return 0;
    }

    @Override
    int add3(int a, int b) {
        return 0;
    }
}

//抽象类类继承抽象类，可以不实现里面的抽象方法
abstract class Acb extends AbstractTest{

}

public class AbstractClssTest{
    public static void main(String[] args) {
        System.out.println(new Ac().add2());
    }
}