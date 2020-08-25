package nuaa.edu.test;

import java.io.Serializable;

/**
 * @author planb
 * @date 2020/8/25 20:38
 * 备注：
 */
public class Student implements Serializable {
    private static final long seriaVersionId = 1L;
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public static long getSeriaVersionId() {
        return seriaVersionId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
