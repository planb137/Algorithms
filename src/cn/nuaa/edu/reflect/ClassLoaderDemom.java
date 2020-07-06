package cn.nuaa.edu.reflect;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author planb
 * @date 2020/7/6 08:53
 * 备注：
 */
public class ClassLoaderDemom {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppClassLoader

        ClassLoader c2 = c.getParent();
        System.out.println(c2);//ExtClassLoader
    }

}
