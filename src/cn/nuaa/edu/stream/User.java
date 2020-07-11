package cn.nuaa.edu.stream;

/**
 * @author planb
 * @date 2020/7/3 16:18
 * 备注：
 */

public class User {
    private int id;
    private String userName;
    private  int  age;

    public User(int id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }
    /*public static void main(String[] args) {
        User user = new User();
        user.setAge(11).setId(121).setUserName("张三");

    }*/
}
