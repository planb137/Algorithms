package nuaa.edu.Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
        System.out.println("正在执行测试方法！");
        //System.out.println(res);
        //利用断言测试结果是否正确
        Assert.assertEquals(3, res);
    }

    /**
      假设初始化方法，用于申请资源等，所有测试方法都在执行之前执行此方法
     **/
    @Before
    public void init(){
        System.out.println("初始化方法");
    }

    /**
     *假设为释放资源方法，所有测试方法执行完毕后，都会自动执行此方法（尽管测试方法执行错误）
     */
    @After
    public void close(){
        System.out.println("释放资源方法");
    }
}
