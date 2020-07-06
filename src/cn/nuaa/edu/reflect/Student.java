package cn.nuaa.edu.reflect;

/**
 * @author planb
 * @date 2020/7/6 09:00
 * 备注：反射目标
 */
public class Student {
    private String name;
    int age;
    public String addrss;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("我爱学习");
    }
    public Student(String name, int age, String addrss) {
        this.name = name;
        this.age = age;
        this.addrss = addrss;
    }
    private void function(String s){
        System.out.println("method"+s);
    }
    public void method1(){
        System.out.println("method");
    }
    public void method2(String s){
        System.out.println("method"+s);
    }
    private int method3(String s,int i){
        System.out.println("调用method");
     return Integer.parseInt(s)+i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addrss='" + addrss + '\'' +
                '}';
    }
}
