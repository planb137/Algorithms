package nuaa.edu.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/9/11 21:40
 * 备注：泛型通配符  上界通配符 List<? extends Animal >
 * 在类型参数中使用 extends 表示这个泛型中的参数必须是 E 或者 E 的子类，这样有两个好处：
 *
 * 下界通配符 < ? super E>
 * 下界: 用 super 进行声明，表示参数化的类型可能是所指定的类型，或者是此类型的父类型，直至 Object
 */
class Animal{
    public int countLegs() {
        return 0;
    }
}
class Dog extends Animal{
    @Override
    public int countLegs() {
        return 2;
    }
}
class Cat extends Animal{
    @Override
    public int countLegs() {
        return 4;
    }

}
public class GenDemo {

    // 上界通配符 List<? extends Animal >
    static int countLegs (List<? extends Animal> animals ) {
        int retVal = 0;
        for ( Animal animal : animals )
        {
            retVal += animal.countLegs();
        }
        return retVal;
    }
    static void test(Animal animal){
        System.out.println(animal.countLegs());
    }
    //此方法只能传animal，不能传其子类
    static int countLegs1 (List<Animal> animals ){
        int retVal = 0;
        for ( Animal animal : animals )
        {
            retVal += animal.countLegs();
        }
        return retVal;
    }
    //下界通配符 < ? super E>
    static <T> void add(List<? super T> dst, List<T> src){
        for (T t : src) {
            dst.add(t);
        }
    }

    public static void main(String[] args) {
            List<Dog> dogs = new ArrayList<>();
            dogs.add(new Dog());
            dogs.add(new Dog());
            List<Cat> cats = new ArrayList<>();
            cats.add(new Cat());
            cats.add(new Cat());
            List<Animal> Animals = new ArrayList<>();
            // 不会报错
            System.out.println(countLegs(dogs));
            System.out.println(countLegs(cats));
             // 报错 countLegs1(dogs);

        List<Animal> animals = new ArrayList<>();
        new GenDemo();
        GenDemo.add(animals,dogs);

        GenDemo.test(new Dog());
    }
}
