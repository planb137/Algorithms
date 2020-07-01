package cn.nuaa.edu.juc;

/**
 * @author planb
 * @date 2020/7/1 15:08
 * 备注：default方法(多个)
 *      static方法（多个）
 */
@FunctionalInterface
interface Foo{
    public void say();
    //public int add(int x,int y);

    default int div(int x ,int y){
        return x/y;
    }
    public static int mv(int x,int y){
        return x*y;
    }
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
        Foo foo2 = () -> {};
        foo2.say();
        System.out.println(foo2.div(10,5));
        System.out.println(Foo.mv(2, 6));

    }

}
