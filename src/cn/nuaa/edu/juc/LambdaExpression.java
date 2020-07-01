package cn.nuaa.edu.juc;

/**
 * @author planb
 * @date 2020/7/1 15:08
 * 备注：
 */
@FunctionalInterface
interface Foo{
    //public void say();
    public int add(int x,int y);
}
public class LambdaExpression {

    public static void main(String[] args) {

/*        Foo foo = new Foo() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
        foo.say();*/
/*        Foo foo =() -> {System.out.println("hello,from lambda expression"); };
        foo.say();*/
        Foo foo2 = (x,y) -> {return x+y;};
        System.out.println(foo2.add(3,5));
    }

}
