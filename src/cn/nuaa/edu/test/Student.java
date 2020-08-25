package nuaa.edu.test;

import java.io.Serializable;

/**
 * @author planb
 * @date 2020/8/25 20:38
 * 备注：
 */
public class Student implements Serializable {
    //序列化对象版本控制，有关各版本反序列化时是否兼容。如果在新版本中这个值修改了，新版本就不兼容旧版本，
    // 反序列化时会抛出InvalidClassException异常。如果修改较小，比如仅仅是增加了一个属性，
    // 我们希望向下兼容，老版本的数据都能保留，那就不用修改；如果我们删除了一个属性，或者更改了类的继承关系，必然不兼容旧数据，
    // 这时就应该手动更新版本号，即SerialVersionUid。
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
