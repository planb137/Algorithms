package nuaa.edu.designPattern.FactoryPattern;

/**
 * @author planb
 * @date 2020/9/7 10:31
 * 备注：简单工厂模式
 */
public class MaskFactory {
    public Imask createMask(String type) {
        Imask mask = null;
        if (type.equals("高端口罩")) {
            mask = new HighEndMask();
        } else if (type.equals("低端口罩")) {
            mask = new LowEndMask();
        }
        return mask;
    }
}
