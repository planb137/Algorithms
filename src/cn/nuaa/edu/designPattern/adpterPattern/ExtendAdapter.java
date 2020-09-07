package nuaa.edu.designPattern.adpterPattern;

/**
 * @author planb
 * @date 2020/9/7 14:32
 * 备注：使用适配器，减少子类不必要的方法实现（只实现自己需要实现类即可）
 */
public class ExtendAdapter {
}

interface Animal {
    public void sing();

    public void run();

    public void cry();

    public void swim();
}

//适配器类，（一般为抽象类，然后空实现）
abstract class AnimalApater implements Animal {
    @Override
    public void sing() {
    }

    @Override
    public void run() {
    }

    @Override
    public void cry() {
    }

    @Override
    public void swim() {
    }
}

//此时，只需要写自己实现的类即可，空实现交给抽象类
class Cat extends AnimalApater {
    @Override
    public void run() {
        System.out.println("我是小猫，我会跑！");
    }

}

//正常来实现接口的话，必须实现所有的方法，比较麻烦
class Dog implements Animal {
    @Override
    public void sing() {
    }

    @Override
    public void run() {
        System.out.println("我是小狗，我会跑！");
    }

    @Override
    public void cry() {
    }

    @Override
    public void swim() {
    }
}