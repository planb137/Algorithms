package cn.nuaa.edu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author planb
 * @date 2020/7/6 09:04
 * 备注： 反射构造函数、成员变量、方法
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Student> c1 = Student.class;
        /*System.out.println(c1);
    Student s = new Student();
        System.out.println(s.getClass()==c1);
        Class<?> c3 = Class.forName("cn.nuaa.edu.reflect.Student");
        System.out.println(c3 ==c1);*/

       Constructor<?>[] constructors = c1.getConstructors();
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor con:declaredConstructors) {
            System.out.println(con);
        }
       Constructor<Student> constructor = c1.getConstructor();
        Student student = constructor.newInstance();
        System.out.println(student);//Student{name='null', age=0, addrss='null'}

        Constructor<Student> constructor1 = c1.getConstructor(String.class, int.class, String.class);
        Student student1 = constructor1.newInstance("lisi", 12, "nanjing");
        System.out.println(student1);//Student{name='lisi', age=12, addrss='nanjing'}*/

        Constructor<?> constructor2 = c1.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);//私有构造方法，取消访问检查，暴力反射
        Object zhangsan = constructor2.newInstance("zhangsan ");
        System.out.println(zhangsan);//Student{name='zhangsan ', age=0, addrss='null'}

        Field[] fields = c1.getFields();
        Field[] fields2 = c1.getDeclaredFields();
        for (Field f: fields2) {
            System.out.println(f);
        }

        Constructor<Student> constructor5 = c1.getConstructor();
        Student student2 = constructor5.newInstance();
        Field address = c1.getField("addrss");
        address.set(student2, "南京");//给obj的成员变量address赋值南京
        System.out.println(student2); //Student{name='null', age=0, addrss='南京'}

        Constructor<Student> constructor3 = c1.getConstructor();
        Student student3 = constructor3.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student1,"planb");
        System.out.println(student3);//Student{name='planb', age=0, addrss='null'}

        Method declaredMethods = c1.getDeclaredMethod("method3", String.class, int.class);
        declaredMethods.setAccessible(true);
        Constructor<Student> constructor4 = c1.getConstructor();
        Student student4 = constructor4.newInstance();
        Object invoke = declaredMethods.invoke(student4, "4",8);
        System.out.println(invoke);
    }
}
