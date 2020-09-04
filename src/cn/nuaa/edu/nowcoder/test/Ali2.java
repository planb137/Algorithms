package nuaa.edu.nowcoder.test;

import java.util.*;

/**
 * @author planb
 * @date 2020/9/4 09:26
 * 备注：阿里巴巴9月4号笔试  求树的个数
 * 7
 * 1 2
 * 1 3
 * 2 4
 * 2 5
 * 3 6
 * 3 7
 */
public class Ali2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 4;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.containsKey(a)) {
                List<Integer> list = map.get(a);
                list.add(b);
                map.put(a, list);
            } else {
                List<Integer> li = new ArrayList<>();
                li.add(b);
                map.put(a, li);
            }
        }

        //先找到所有叶子节点
        Set<Integer> set = new HashSet<>();
        for (Integer in : map.keySet()) {
            List<Integer> aa = map.get(in);
            for (Integer x : aa) {
                if (!map.containsKey(x)) {
                    set.add(x);
                }
            }
        }
        System.out.println(max);
    }

}
