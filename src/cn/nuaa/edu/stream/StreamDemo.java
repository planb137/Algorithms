package cn.nuaa.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author planb
 * @date 2020/7/3 16:18
 * 备注：流式计算java.util.Stream,
 *           java.util.function(四大函数式接口)
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        User user =  new User(11, "a", 23);
        User user2 = new User(12, "b", 24);
        User user3 = new User(13, "c", 22);
        User user4 = new User(14, "d", 28);
        User user5 = new User(16, "e", 26);
        List<User> list = Arrays.asList(user, user2, user3, user4, user5);
        /*list.stream().filter(u -> {
            return u.getId() % 2 == 0;}).filter( t ->{
                return t.getAge()>24; }).map(s -> {
                    return s.getUserName().toUpperCase();}).sorted((a,b)->{
                        return -a.compareTo(b);}).limit(1).forEach(System.out::println);
*/

        List<String>strings = Arrays.asList("abc", " ", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        System.out.println(strings.stream().filter(string -> string.isEmpty()).count());
       /* Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 1024;
            }
        };

        Function<String, Integer> function2 = s->{return s.length();};
        System.out.println(function2.apply("1addad"));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        Predicate<String> predicate2 = s ->{return s.isEmpty();};
        System.out.println(predicate2.test("aaa"));

        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s+",nihao ");
            }
        };
        Consumer<String> consumer2 = s ->{System.out.println(s+",nihao ");};
        consumer2.accept("planb");
        Supplier<String> supplier =new Supplier<String>(){
            @Override
            public String get() {
                return "java";
            }
        };
        Supplier<String> supplier2 = ()->{return "java 02";};
        System.out.println(supplier2.get());*/


        Supplier<String> stringCallable = () -> {
            return "java";
        };
        stringCallable.get();
    }
}
