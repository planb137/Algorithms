package nuaa.edu.designPattern.FactoryPattern;

/**
 * @author planb
 * @date 2020/9/7 10:28
 * 备注：工厂模式
 * 1.简单工厂模式。
 * 2.工厂方法模式：每一个口罩子类都对应一个工厂子类，
 *              利用多态特性动态创建对象的模式。
 * 3.抽象工厂模式：
 */
public interface Imask {
    void show();

    Imask create();
}

class HighEndMask implements Imask {

    @Override
    public void show() {
        System.out.println("我是高端口罩");
    }

    @Override
    public Imask create() {
        Imask mask = new HighEndMask();

        //HighEndMask 100行初始化代码
        return mask;
    }
}

class LowEndMask implements Imask {

    @Override
    public void show() {
        System.out.println("我是低端口罩");
    }

    @Override
    public Imask create() {
        Imask mask = new LowEndMask();

        //LowEndMask 100行初始化代码
        return mask;
    }
}