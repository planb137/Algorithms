package cn.nuaa.edu.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author planb
 * @date 2020/7/6 10:16
 * 备注：通过配置文件运行指定类的制定方法
 */
public class RunMethodByConfigFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Student student1 = new Student();
       // student1.study();

        //Teacher teacher = new Teacher();
        //teacher.teach();
        Properties properties = new Properties();
        FileReader fr = new FileReader("class.txt");
        properties.load(fr);
        fr.close();
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("method");

        //通过反射来使用配置文件
        Class<?>  c = Class.forName(className);
        Constructor<?> constructor = c.getDeclaredConstructor();//获得构造方法
        Object obj = constructor.newInstance();//通过构造方法，取得对象的实例
        Method method = c.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);
    }
}
