package nuaa.edu.test;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author planb
 * @date 2020/9/19 14:18
 * 备注：
 */
public class DoorTest {
    @Test
    public void testDemo() throws IOException {
        new MyAnswer().loadData("/Users/planb/Desktop/door");
    }

    @Test
    public void testDemo2() throws IOException {
        System.out.println(new MyAnswer().countGuests("20220303"));
    }

    @Test
    public void testCountErrors() throws IOException {
        System.out.println(new MyAnswer().countErrors());
    }

    @Test
    public void testBrandRank() throws IOException {
        List<String> list = new MyAnswer().brandRank();
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        String s = "我是中国人，你好！";
        System.out.println(s.substring(0, 3));
    }


}
