package nuaa.edu.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author planb
 * @date 2020/8/27 15:35
 * 备注：可以到达所有点的最少点数目(入度为0的点)
 */
public class LeetCode1557 {
    // 通过65 / 66 个测试用例，100000个节点的时候超时
    public List<Integer> findSmallestSetOfVertices2(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> list : edges) {
            Integer y = list.get(1);
            if (map.containsKey(y)) {
                map.put(y, map.get(y) + 1);
            }
            map.put(y, 1);
        }
        for (List<Integer> list : edges) {
            Integer x = list.get(0);
            if (!map.containsKey(x) && !res.contains(x)) {
                res.add(x);
            }
        }
        return res;
    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] degree = new int[n];
        for (List<Integer> list : edges) {
            degree[list.get(1)]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            if(degree[i] == 0){
                res.add(i);
            }
        }
        return res;
    }

    @Test
    public void testFind() {
        int n = 6;
        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        List<Integer> li2 = new ArrayList<>();
        li2.add(0);
        li2.add(2);
        List<Integer> li3 = new ArrayList<>();
        li3.add(2);
        li3.add(5);
        List<Integer> li4 = new ArrayList<>();
        li4.add(3);
        li4.add(4);
        List<Integer> li5 = new ArrayList<>();
        li5.add(4);
        li5.add(2);
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(li);
        edges.add(li2);
        edges.add(li3);
        edges.add(li4);
        edges.add(li5);
        System.out.println(findSmallestSetOfVertices(n, edges).toString());
    }

}
