package nuaa.edu.designPattern;

import nuaa.edu.designPattern.FactoryPattern.Imask;
import nuaa.edu.designPattern.FactoryPattern.MaskFactory;

/**
 * @author planb
 * @date 2020/9/7 10:26
 * 备注：
 */
public class Test {
    public static void main(String[] args) {
        MaskFactory maskFactory = new MaskFactory();
        Imask maskA = maskFactory.createMask("高端口罩");
        Imask maskB = maskFactory.createMask("低端口罩");
        maskA.show();
        maskB.show();
    }
}
