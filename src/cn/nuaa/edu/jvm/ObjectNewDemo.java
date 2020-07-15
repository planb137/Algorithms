package cn.nuaa.edu.jvm;

/**
 * @author planb
 * @date 2020/7/15 14:16
 * 备注：// class version 52.0 (52)
 * // access flags 0x21
 * public class cn/nuaa/edu/jvm/ObjectNewDemo {
 *
 *   // compiled from: ObjectNewDemo.java
 *
 *   // access flags 0x1
 *   public <init>()V
 *    L0
 *     LINENUMBER 8 L0
 *     ALOAD 0
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     RETURN
 *    L1
 *     LOCALVARIABLE this Lcn/nuaa/edu/jvm/ObjectNewDemo; L0 L1 0
 *     MAXSTACK = 1
 *     MAXLOCALS = 1
 *
 *   // access flags 0x9
 *   public static main([Ljava/lang/String;)V
 *    L0
 *     LINENUMBER 10 L0
 *     NEW java/lang/Object
 *     DUP
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     ASTORE 1
 *    L1
 *     LINENUMBER 12 L1
 *     RETURN
 *    L2
 *     LOCALVARIABLE args [Ljava/lang/String; L0 L2 0
 *     LOCALVARIABLE o Ljava/lang/Object; L1 L2 1
 *     MAXSTACK = 2
 *     MAXLOCALS = 2
 * }
 */
public class ObjectNewDemo {
    public static void main(String[] args) {
        Object o = new Object();

    }
}
