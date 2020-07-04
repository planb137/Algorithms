package cn.nuaa.edu.jvm;

import sun.rmi.transport.proxy.RMISocketInfo;

/**
 * @author planb
 * @date 2020/7/4 15:20
 * 备注：java里面只有值传递
 */
class Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}
public class TestTransform {

    public void chage(String str){
        str = "bbb";
    }
    public void chage2(StringBuffer stringBuffer){
        stringBuffer.append("bbb");
    }
    public void changePerson(Person person) {
        person.setName("lisi");
    }
    public static void main(String[] args) {
/*        String str = "aaa";
        String c ="bbb";
        new TestTransform().chage(str);
        System.out.println(str);*/
/*
        int x = 7;
        new TestTransform().chage2(x);
        System.out.println(x);
*/
        StringBuffer sss = new StringBuffer("aaa");
        new TestTransform().chage2(sss);
        System.out.println(sss);
/*        Person person = new Person("zhangsan");
        new TestTransform().changePerson(person);
        System.out.println(person.getName());*/
    }
}

