package nuaa.edu.Junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author planb
 * @date 2020/8/26 10:26
 * 备注：Junit单元测试
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int res = calculator.add(3, 5);
        //System.out.println(res);
        //利用断言测试结果是否正确
        Assert.assertEquals(3, res);
    }

}
