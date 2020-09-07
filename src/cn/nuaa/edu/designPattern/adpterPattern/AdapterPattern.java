package nuaa.edu.designPattern.adpterPattern;

/**
 * @author planb
 * @date 2020/9/7 14:14
 * 备注：适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
public class AdapterPattern {
    public static void main(String[] args) {
        PowerA powerA = new PowerAImpl();
        worker(powerA);
        //如果想传入powerB，需要使用适配器
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Adapter adapter = new Adapter(new PowerBImpl());
        worker(adapter);
    }

    //woker只能接入PowerA对象，这时候如果需要接入PowerB咋办???
    public static void worker(PowerA powerA) {
        System.out.println("开始工作。。。");
        powerA.insert();
        System.out.println("工作结束。。。");
    }
}
//适配器
class Adapter implements PowerA {
    private PowerB powerB;

    public Adapter(PowerB powerB) {
        this.powerB = powerB;
    }
    @Override
    public void insert() {
        powerB.connect();
    }
}

interface PowerA {
    public void insert();
}

class PowerAImpl implements PowerA {
    @Override
    public void insert() {
        System.out.println("PowerA插入。。。");
    }
}

interface PowerB {
    public void connect();
}

class PowerBImpl implements PowerB {
    @Override
    public void connect() {
        System.out.println("PowerB插入。。。");
    }
}