package nuaa.edu.test;

/**
 * @author planb
 * @date 2020/8/26 20:10
 * 备注：
 */
public class UnitDemo {
    public <T> int genericAdd(T a, T b) {
        int c = (int) a + (int) b;
        //System.out.println(a + "+" + b + "="+a+b);
        return (int) c;
    }

    public int add(int a, int b) {
        return a + b;
    }

}
