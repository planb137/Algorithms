package nuaa.edu.test;

import java.io.*;

/**
 * @author planb
 * @date 2020/8/25 20:37
 * 备注：对象序列化与反序列化
 */
public class SerializableDemo {
    public static void main(String[] args)  throws Exception,IOException{
        serializebleUser();
        deSerializebleUser();
    }

    private static void serializebleUser() throws FileNotFoundException, IOException {
        Student student = new Student();
        student.setName("planb");
        student.setAge(25);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/planb/serial.txt"));
        oos.writeObject(student);
        oos.close();
        System.out.println("序列化对象成功");
    }

    private static void deSerializebleUser() throws ClassNotFoundException, IOException {
        File file = new File("/Users/planb/serial.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/planb/serial.txt"));
        Student studeng =  (Student)ois.readObject();
        System.out.println(studeng.toString());
        System.out.println("反序列化对象成功");
    }
}
